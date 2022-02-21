package com.arbade.gjc.repository;

import java.util.List;
import java.util.UUID;

import com.arbade.gjc.model.dto.request.UserRequestDto;
import com.arbade.gjc.model.dto.response.UserResponseDto;
import com.arbade.gjc.model.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, UUID> {

    long countAllByCountry(String country);

//    User findUserByUuid(String id);
//
//    void deleteUserByUuid(String id);

    List<User> findAllByPointsBetween(double from, double to);

    List<User> findUserByCountry(String country);


    User insert(List<UserRequestDto> list);
}
