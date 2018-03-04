package com.epam.webPlanner;

import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.controllers.MainConrtoller;
import com.epam.webPlanner.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class WebPlannerApplication implements CommandLineRunner {

	@Autowired
	private UsersRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(WebPlannerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new User(1, "lil2210", "admin","Liliya","Fedyushko","lil2210"));
		repository.save(new User(2, "mvovc", "user","Marko","Vovchok","mvovc"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();


	}
}
