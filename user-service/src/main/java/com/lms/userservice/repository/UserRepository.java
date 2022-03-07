package com.lms.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lms.userservice.entity.Users;

public interface UserRepository extends MongoRepository<Users, Integer>{
	Users findByUsername(String username);
}
