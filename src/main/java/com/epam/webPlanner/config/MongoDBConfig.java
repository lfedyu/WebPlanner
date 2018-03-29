package com.epam.webPlanner.config;


import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UserRepositoryMongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepositoryMongo.class)
@Configuration
public interface MongoDBConfig extends MongoRepository<User, Integer>{


}
