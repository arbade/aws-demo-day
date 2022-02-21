package com.arbade.gjc.service;


import com.arbade.gjc.mapper.LeaderboardMapper;
import com.arbade.gjc.model.entity.Leaderboard;
import com.arbade.gjc.repository.LeaderboardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class LeaderboardService {


    private final LeaderboardRepository leaderboardRepository;

    public LeaderboardService(LeaderboardRepository leaderboardRepository) {

        this.leaderboardRepository = leaderboardRepository;
    }

    public List<Leaderboard> getLeaderboard() {
        List<Leaderboard> leaderboards = leaderboardRepository.findAllByOrderByPointsDesc();
        for (int i = 0; i < leaderboards.size(); i++) {
            leaderboards.get(i).setRank(i + 1);

        }
        return leaderboards;
    }

    public List<Leaderboard> getLeaderboardByCountry(String country) {
        List<Leaderboard> leaderboards = leaderboardRepository.findAllByCountryOrderByPointsDesc(country);
        for (int i = 0; i < leaderboards.size(); i++) {
            leaderboards.get(i).setRank(i + 1);

        }
        return leaderboards;

    }
}
