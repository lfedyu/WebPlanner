package com.epam.webPlanner.controllers;

import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.UsersRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


public class UserControllerTest {

    UserController userController;
    @Mock
    UsersRepository usersRepository;
    MockMvc mockMvc;
    List <User> usersResp;

    @Before
    public void setUp() throws Exception {
        userController = new UserController(usersRepository);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(userController,"usersRepository",usersRepository);

        usersResp = new ArrayList<User>();
        usersResp.add(new User(1, "lil2210", "admin","Liliya","Fedyushko","lil2210"));
        usersResp.add(new User(2, "mvovc", "user","Marko","Vovchok","mvovc"));
    }

    @Test
    public void getAll() throws Exception {
        Mockito.when(userController.getAll()).thenReturn(usersResp);

        List <User> result = userController.getAll();
        Assert.assertEquals(usersResp,result);

        /*mockMvc.perform(get("/users/")
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("user", hasSize(2)))
        .andExpect(jsonPath("user[0].userName", is("lil2210")));*/


    }
}