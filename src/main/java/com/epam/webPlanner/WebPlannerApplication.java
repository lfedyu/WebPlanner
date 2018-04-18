package com.epam.webPlanner;

import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.beans.UserBuilder;
import com.epam.webPlanner.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class WebPlannerApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	//private UserRepositoryMongo repository;
    private static final Logger log = LoggerFactory.getLogger(WebPlannerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebPlannerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new UserBuilder().setId(1).setUsername("lil2210").setRole("admin").setFirstName("Liliya").setLastName("Fedyushko").setPassword("lil2210").createUser());
		repository.save(new UserBuilder().setId(2).setUsername("mvovc").setRole("user").setFirstName("Marko").setLastName("Vovchok").setPassword("mvovc").createUser());

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();


	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a couple of customers
            repository.save(new UserBuilder().setId(1).setUsername("lil2210").setRole("admin").setFirstName("Liliya").setLastName("Fedyushko").setPassword("lil2210").createUser());
            repository.save(new UserBuilder().setId(2).setUsername("mvovc").setRole("user").setFirstName("Marko").setLastName("Vovchok").setPassword("mvovc").createUser());

            // fetch all customers
			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
			log.info("");

			// fetch an individual customer by ID
            Optional.of(repository.findById(2))
					.ifPresent( user -> {
						log.info("user found with findById(1):");
						log.info("--------------------------------");
						log.info(user.toString());
						log.info("");
					});

			// fetch customers by last name
			log.info("User found with findByFirstName('Liliya'):");
			log.info("--------------------------------------------");
			repository.findByFirstName("Liliya").forEach(lil -> {
				log.info(lil.toString());
			});
			 for (User user : repository.findByFirstName("Liliya")) {
			 	log.info(user.toString());
			 }
			log.info("");
		};
	}

}
