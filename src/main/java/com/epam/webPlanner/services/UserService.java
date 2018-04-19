package com.epam.webPlanner.services;

import com.epam.webPlanner.beans.Plan;
import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

    public List<User> getAllUsers(){
    return  userRepository.findAll();
    }
    public List <Plan> getAllPlanesForUser (Integer userId){
        return userRepository.findById(userId).getPlanList();
    }
    public User getUserById(Integer userId){
        return userRepository.findById(userId);
    }
    public void addUser (User user){
        userRepository.save(user);
    }
    public void updateUser (User user){
        userRepository.save(user);
    }
    public void deleteUser (Integer id){
        userRepository.delete(id);
    }

}
