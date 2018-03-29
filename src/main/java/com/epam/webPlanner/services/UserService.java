package com.epam.webPlanner.services;

import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UserRepositoryJpa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

private UserRepositoryJpa userRepository;
    User user;
    List <User> users;

    public List<User> getAllUsers(){
    return  userRepository.findAll();
    }

    public User getUserById(Integer userId){
        user = userRepository.findById(userId);
        return user;
    }


}
