package com.arbade.gjc.controller;


import com.arbade.gjc.model.dto.request.ScoreRequestDto;
import com.arbade.gjc.model.dto.response.ScoreResponseDto;
import com.arbade.gjc.service.ScoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/score")
@Api(value = "GJG Backend Management System for Score Controller", description = "Operations pertaining to submit score in gjg backend")
@RequiredArgsConstructor
@Slf4j
public class ScoreController {

    private final ScoreService scoreService;


    @PostMapping
    @ApiOperation(value = "Submit new score to user by user id")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiResponse(code = 201, message = "UserResponseDto")
    public ResponseEntity<ScoreResponseDto> submit(@RequestBody ScoreRequestDto scoreRequestDto) throws Exception {
        ScoreResponseDto scoreResponseDto = scoreService.submit(scoreRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(scoreResponseDto);
    }


}
