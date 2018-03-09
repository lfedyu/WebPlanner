package com.epam.webPlanner.services;

import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService {

private UserRepository userRepository;
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
