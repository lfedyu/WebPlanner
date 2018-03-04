package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface UsersRepository extends MongoRepository<User, Integer>{

    public User findById(Integer id);
    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);

}
