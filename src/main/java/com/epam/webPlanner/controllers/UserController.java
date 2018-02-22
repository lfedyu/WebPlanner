package com.epam.webPlanner.controllers;


import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UsersRepository usersRepository;

    @Autowired
    public UserController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/")
    public List<User> getAll(){
        return usersRepository.findAll();
    }
}
