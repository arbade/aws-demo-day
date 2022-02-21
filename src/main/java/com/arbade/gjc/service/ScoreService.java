package com.arbade.gjc.service;


import com.arbade.gjc.mapper.ScoreMapper;
import com.arbade.gjc.model.dto.request.ScoreRequestDto;
import com.arbade.gjc.model.dto.response.ScoreResponseDto;
import com.arbade.gjc.model.entity.Score;
import com.arbade.gjc.model.entity.User;
import com.arbade.gjc.repository.ScoreRepository;
import com.arbade.gjc.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ScoreService {


    private final UserRepository userRepository;

    @Autowired
    public ScoreService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public ScoreResponseDto submit(ScoreRequestDto scoreRequestDto) throws Exception {
        User user = userRepository.findById(scoreRequestDto.get_id()).orElseThrow(() -> new Exception("Not Found"));
        if (user.getScores() == null) {
            user.setScores(new ArrayList());
        }
        user.getScores().add(Score.builder().scoreWorth(scoreRequestDto.getScoreWorth()).timestamp(new Date()).build());
        user.setHighScore(Math.max(user.getHighScore(), scoreRequestDto.getScoreWorth()));
        double oldPoint = user.getPoints();
        user.setPoints(user.getPoints() + scoreRequestDto.getScoreWorth());
        userRepository.save(user);
        List<User> allByPointsBetween = userRepository.findAllByPointsBetween(oldPoint, user.getPoints());
//        allByPointsBetween.forEach(user1 -> {
//            user1.setGlobalRank(user1.getGlobalRank() + 1);
//            user1.setLocalRank(user1.getLocalRank() + 1);
//        });
        userRepository.saveAll(allByPointsBetween);
        ScoreResponseDto scoreResponseDto = new ScoreResponseDto();
        scoreResponseDto.set_id(scoreRequestDto.get_id());
        scoreResponseDto.setScoreWorth(scoreRequestDto.getScoreWorth());
        scoreResponseDto.setTimestamp(new Date());
        return scoreResponseDto;
    }

}
