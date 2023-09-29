package com.springboot.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User bruno = new User("1", "Bruno Amorim", "bruno@hotmail.com");
		User vinicius = new User("2", "Vinicius Leite", "vinicius@outlook.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(bruno, vinicius));
		return ResponseEntity.ok().body(list);
	}
}
