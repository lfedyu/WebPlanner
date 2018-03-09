package com.epam.webPlanner.controllers;

import com.epam.webPlanner.WebPlannerApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebPlannerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerIntegrationTest {

    @LocalServerPort
    private int port;

    TestRestTemplate testRestTemplate;
    HttpHeaders httpHeaders;

    @Before
    public void setUp() throws Exception {
        testRestTemplate = new TestRestTemplate();
        httpHeaders = new HttpHeaders();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAll() {
        /*mockMvc.perform(get("/users/")
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("user", hasSize(2)))
        .andExpect(jsonPath("user[0].userName", is("lil2210")));*/

    }
}