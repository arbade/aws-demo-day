package com.arbade.gjc.controller;

import com.arbade.gjc.model.dto.request.ScoreRequestDto;
import com.arbade.gjc.model.dto.response.ScoreResponseDto;
import com.arbade.gjc.service.ScoreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

class ScoreControllerTest {

    @Mock
    ScoreService scoreService;

    @InjectMocks
    ScoreController scoreController;

    @Mock
    ScoreResponseDto scoreResponseDtoMock;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void submit_shouldSubmitScore_WhenParamsAreValid() throws Exception {
        //given
        ScoreRequestDto requestDto = new ScoreRequestDto();
        requestDto.set_id(UUID.randomUUID());
        requestDto.setScoreWorth(10.2);
        //when
        when(scoreService.submit(requestDto)).thenReturn(scoreResponseDtoMock);
        //then
        ResponseEntity<ScoreResponseDto> responseEntity = scoreController.submit(requestDto);
        assertEquals(HttpStatus.CREATED,responseEntity.getStatusCode());
        assertTrue(responseEntity.hasBody());

//        verifyNoMoreInteractions(scoreService);
    }
}