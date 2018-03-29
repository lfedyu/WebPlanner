package com.epam.webPlanner.controllers;

import com.epam.webPlanner.beans.UserBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.Map;


@Controller
public class MainConrtoller {
    @Value("${application.message}")
    private String message = "Hi there!";

    @GetMapping("/")
    public String index(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", this.message );
        return "index";
    }

    @GetMapping("/{userName}")
    public String myPage(@PathVariable("userName") String userName, Map<String, Object> model){
        model.put("userName", new UserBuilder().createUser().getUserName());
        return "userPage";
    }

}
