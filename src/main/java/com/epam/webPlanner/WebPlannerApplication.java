package com.epam.webPlanner;

import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.beans.UserBuilder;
import com.epam.webPlanner.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class WebPlannerApplication {

	@Autowired
	private UserRepository repository;
	//private UserRepositoryMongo repository;
    private static final Logger log = LoggerFactory.getLogger(WebPlannerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebPlannerApplication.class, args);
	}


}
