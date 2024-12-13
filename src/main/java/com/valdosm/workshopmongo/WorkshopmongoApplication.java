package com.valdosm.workshopmongo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.valdosm.workshopmongo.domain.User;
import com.valdosm.workshopmongo.repository.UserRepository;


@SpringBootApplication
@Configuration
public class WorkshopmongoApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository repo;


	public static void main(String[] args) {
		SpringApplication.run(WorkshopmongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		User user =  new User(null, "Pedro", "pedro.moreira@gmail.com");
		User user2 =  new User(null, "Carlos", "carlos.silva@gmail.com");
		User user3 =  new User(null, "Maria", "maria.piedade@gmail.com");
		User user4=  new User(null, "Joana", "joana.despointes@gmail.com");
		repo.saveAll(Arrays.asList(user, user2, user3, user4));
	}


}
