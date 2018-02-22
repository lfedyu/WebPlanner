package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsersRepository extends MongoRepository<User, Integer>{


}
