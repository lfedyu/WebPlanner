package com.epam.webPlanner.controllers;


import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.beans.UserBuilder;
import com.epam.webPlanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        //userService.addUser(new UserBuilder().setId(1).setUsername("lil2210").setRole("admin").setFirstName("Liliya").setLastName("Fedyushko").setPassword("lil2210").createUser());
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(){
        userService.addUser(new UserBuilder().setId(1).setUsername("lil2210").setRole("admin").setFirstName("Liliya").setLastName("Fedyushko").setPassword("lil2210").createUser());
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Integer id ){
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void addUser(@PathVariable Integer id ){
        userService.deleteUser(id);
    }
}
