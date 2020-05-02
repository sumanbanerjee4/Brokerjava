package com.home.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.home.HomeApplication;
import com.home.error.CustomErrorType;
import com.home.model.Advertisement;
import com.home.model.SignUp;
import com.home.repo.SignUpRepository;
import com.home.service.SignUpService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SingupController {

	@Autowired
	SignUpRepository repository;
	
/*
		public static final Logger logger = LoggerFactory.getLogger(HomeApplication.class);

		@Autowired
		private SignUpService signupService;

		// request method to create a new account by a guest
		@CrossOrigin
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public ResponseEntity<?> createUser(@RequestBody SignUp newUser) {
			if (signupService.find(newUser.getFirstname()) != null) {
				logger.error("username Already exist " + newUser.getFirstname());
				return new ResponseEntity(
						new CustomErrorType("user with username " + newUser.getFirstname() + "already exist "),
						HttpStatus.CONFLICT);
			}
			//newUser.setRole("USER");
			
			return new ResponseEntity<SignUp>(signupService.save(newUser), HttpStatus.CREATED);
		}

		// this is the login api/service
		@CrossOrigin
		@RequestMapping("/login")
		public Principal user(Principal principal) {
			logger.info("user logged "+principal);
			return principal;
		}

		
		
	}
	
	
	
	
	
	
	
*/	@Bean
	public CorsFilter corsFilters() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("CREATE");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("DELETE");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}




	@PostMapping("/signup/create")
	public String postCustomer(@RequestBody SignUp signup) {

		String email=signup.getEmail();

		
			
		
	
			SignUp customer = repository.save(signup);


			return customer.getEmail()+" is Successfully registered";
	}
	
}



