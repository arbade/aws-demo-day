package com.arbade.gjc.repository;

import com.arbade.gjc.model.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScoreRepository extends MongoRepository<User, String> {

}
