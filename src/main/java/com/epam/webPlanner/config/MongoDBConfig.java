package com.epam.webPlanner.config;


import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UsersRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public interface MongoDBConfig extends MongoRepository<User, Integer>{


}
