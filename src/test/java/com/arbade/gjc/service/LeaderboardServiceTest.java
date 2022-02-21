package com.arbade.gjc.service;

import com.arbade.gjc.model.entity.Leaderboard;
import com.arbade.gjc.repository.LeaderboardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LeaderboardServiceTest {

    @Mock
    LeaderboardRepository leaderboardRepository;

    @Mock
    List<Leaderboard> leaderboard;

    @InjectMocks
    LeaderboardService leaderboardService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getLeaderboard_shouldReturnLeaderList() {
        //given
        //when
        when(leaderboardRepository.findAllByOrderByPointsDesc()).thenReturn(leaderboard);
        List<Leaderboard> list = leaderboardService.getLeaderboard();
        //then

        assertNotNull(list);
        assertFalse(list.isEmpty());

        verify(leaderboardRepository, times(1)).findAllByOrderByPointsDesc();
        verifyNoMoreInteractions(leaderboardRepository);
    }

    @Test
    void getLeaderboardByCountry_shouldReturnLeaderListByCountry() {
        //given
        Leaderboard leaderboardList = new Leaderboard();
        leaderboardList.setCountry("tr");
        //when
        when(leaderboardRepository.findAllByCountryOrderByPointsDesc(leaderboardList.getCountry())).thenReturn(leaderboard);
        List<Leaderboard> list = leaderboardService.getLeaderboardByCountry(leaderboardList.getCountry());

        assertNotNull(list);
        assertFalse(list.isEmpty());
        verify(leaderboardRepository, times(1)).findAllByCountryOrderByPointsDesc(leaderboardList.getCountry());
        verifyNoMoreInteractions(leaderboardRepository);

        //then

    }
}