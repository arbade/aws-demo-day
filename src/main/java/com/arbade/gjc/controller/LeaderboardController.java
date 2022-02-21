package com.arbade.gjc.controller;


import com.arbade.gjc.model.entity.Leaderboard;
import com.arbade.gjc.model.entity.User;
import com.arbade.gjc.service.LeaderboardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/leaderboard")
@Api(value = "GJG Backend Management System for Leaderboard Controller", description = "Operations pertaining to leaderboard in gjg backend")
@RequiredArgsConstructor
@Slf4j
public class LeaderboardController {

    private final LeaderboardService leaderboardService;

    @ApiOperation(value = "Get Global Leaderboard List")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    @ApiResponse(code = 200, message = "Global Leaderboard")
    public List<Leaderboard> getLeaderboardList() throws Exception {
        return leaderboardService.getLeaderboard();
    }

    @ApiOperation(value = "Get Local Leaderboard List by country")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{country}")
    @ApiResponse(code = 200, message = "Local Leaderboard")
    public List<Leaderboard> getLeaderboardList(@ApiParam(value = "country 'tr,us...'", required = true, example = "1")  @PathVariable String country) throws Exception {
        return leaderboardService.getLeaderboardByCountry(country);
    }


}
