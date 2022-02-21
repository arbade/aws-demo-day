package com.arbade.gjc.service;

import com.arbade.gjc.model.dto.request.ScoreRequestDto;
import com.arbade.gjc.model.dto.response.ScoreResponseDto;
import com.arbade.gjc.model.entity.User;
import com.arbade.gjc.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ScoreServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    ScoreService scoreService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void submit_shouldSubmitScore() throws Exception {
        //given
        ScoreRequestDto scoreRequestDto = new ScoreRequestDto();
        scoreRequestDto.set_id(UUID.randomUUID());
        scoreRequestDto.setScoreWorth(1.1);

        double oldPoint = 5.5;
        double newPoint = 6.6;

        User user = new User();
        user.setScores(new ArrayList<>());
        user.setHighScore(3.3);
        user.setPoints(oldPoint);

        List<User> userList = new ArrayList<>();
        userList.add(Mockito.mock(User.class));

        //when
        when(userRepository.findById(scoreRequestDto.get_id())).thenReturn(Optional.of(user));
        when(userRepository.save(user)).thenReturn(user);
        when(userRepository.findAllByPointsBetween(oldPoint, newPoint)).thenReturn(userList);
        when(userRepository.saveAll(userList)).thenReturn(userList);
        //then
        ScoreResponseDto responseDto = scoreService.submit(scoreRequestDto);

        assertNotNull(responseDto);
        assertEquals(scoreRequestDto.get_id(), responseDto.get_id());
        assertEquals(scoreRequestDto.getScoreWorth(), responseDto.getScoreWorth());
        assertNotNull(responseDto.getTimestamp());

        verify(userRepository, times(1)).findById(scoreRequestDto.get_id());
        verify(userRepository, times(1)).save(user);
        verify(userRepository, times(1)).findAllByPointsBetween(oldPoint, newPoint);
        verify(userRepository, times(1)).saveAll(userList);

        verifyNoMoreInteractions(userRepository);
    }
}