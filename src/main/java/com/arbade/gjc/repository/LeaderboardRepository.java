package com.arbade.gjc.repository;

import com.arbade.gjc.model.entity.Leaderboard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface LeaderboardRepository extends PagingAndSortingRepository<Leaderboard, UUID>
{

    List<Leaderboard> findAllByOrderByPointsDesc();

    List<Leaderboard> findAllByCountryOrderByPointsDesc(String country);
}
