package com.matheuspadilha.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheuspadilha.project.entities.User;
import com.matheuspadilha.project.repositories.UserRepository;

@Configuration
@Profile("test")
//This annotation is used to make this class exclusive a test profile
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	//Dependency injection

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
	