package com.epam.webPlanner.controllers;

import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UserRepository;
import com.epam.webPlanner.services.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


public class UserControllerTest {
    @InjectMocks
    private UserController userController;
    @Mock
    private UserService userService;
    List <User> usersResp;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        userController = new UserController(userService);
        MockMvcBuilders.standaloneSetup(userController).build();
        usersResp = Arrays.asList(
        new User(1, "lil2210", "admin","Liliya","Fedyushko","lil2210"),
        new User(2, "mvovc", "user","Marko","Vovchok","mvovc"));
    }

    @Test
    public void getAllUsers() {
        Mockito.when(userController.getAllUsers()).thenReturn(usersResp);
        List <User> result = userController.getAllUsers();
        Assert.assertEquals(usersResp,result);
        Mockito.verify(userService).getAllUsers();

    }
}