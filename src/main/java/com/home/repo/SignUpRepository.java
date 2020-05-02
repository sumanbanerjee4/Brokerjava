package com.home.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.home.model.SignUp;


public interface SignUpRepository extends MongoRepository<SignUp, String>{

	List<SignUp> findByEmail(String email);

	





}
