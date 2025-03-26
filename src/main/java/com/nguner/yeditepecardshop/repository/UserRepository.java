package com.nguner.yeditepecardshop.repository;


import com.nguner.yeditepecardshop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);




}

