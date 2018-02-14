package com.epam.webPlanner.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;


@Controller
public class MainConrtoller {
    @Value("${application.message}")
    private String message = "Hi there!";

    @GetMapping("/")
    public String welcome(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", this.message );
        return "welcome";
    }
}
