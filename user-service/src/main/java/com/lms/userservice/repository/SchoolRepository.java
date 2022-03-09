package com.lms.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lms.userservice.entity.Schools;

public interface SchoolRepository extends MongoRepository<Schools, Integer> {

}
