package com.epam.webPlanner;

import com.epam.webPlanner.controllers.MainConrtoller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = MainConrtoller.class)
public class WebPlannerApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebPlannerApplication.class, args);
	}
}
