package com.home.configuration;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.home.model.SignUp;
import com.home.repo.MongoRepo;
import com.home.repo.SignUpRepository;



@EnableMongoRepositories(basePackageClasses = { MongoRepo.class,SignUpRepository.class})
@Configuration
public class MongoDBConfiguration {

	/*
	@Bean
	CommandLineRunner commandLineRunner(MongoRepo mongoRepo) {
		return strings -> {
			mongoRepo.deleteAll();
		
		};
	}

	@Bean
	CommandLineRunner commandLineRunner1(SignUpRepository Repo) {
		return strings -> {
			Repo.deleteAll();
		
		};
	}*/

}
