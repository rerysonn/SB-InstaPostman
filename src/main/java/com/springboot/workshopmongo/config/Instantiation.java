package com.springboot.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springboot.workshopmongo.domain.User;
import com.springboot.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User mario = new User(null, "Mario Sergio", "mario@paysandu.com");
		User joao = new User(null, "Joao Vieira", "joao@paysandu.com");
		User yuri = new User(null, "Yuri Alberto", "yuri@corinthians.com");
		
		userRepository.saveAll(Arrays.asList(mario, joao, yuri));
	}

}
