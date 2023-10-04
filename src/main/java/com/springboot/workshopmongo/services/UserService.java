package com.springboot.workshopmongo.services;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.workshopmongo.domain.User;
import com.springboot.workshopmongo.dto.UserDTO;
import com.springboot.workshopmongo.repository.UserRepository;
import com.springboot.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	//ENCONTRAR TODOS OS USUARIOS
	public List<User> findAll() {
		return repo.findAll();
	}
	
	// ENCONTRAR O USUARIO PELO ID
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	//INSERIR USUARIO
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(),
				objDto.getName(),
				objDto.getEmail());
	}
	
	// DELETAR USUARIO
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
}
