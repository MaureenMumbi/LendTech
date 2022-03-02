package com.lendtech.digilend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendtech.digilend.exceptions.NotFoundException;
import com.lendtech.digilend.model.User;
import com.lendtech.digilend.repository.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {
	
	
	private final UserRepository repository;
	public UserController(UserRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/users")
	List<User> getUsers(){
		return repository.findAll();
	}
	
	@PostMapping("/users")
	User newUser(@RequestBody User newUser) {
		
		return repository.save(newUser);
	}
	
	@GetMapping("/user/{id}")
	User oneUSER(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(()-> new NotFoundException("user ",id));
	}
		
	
	@DeleteMapping("user/{id}")
	void deleteUser(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	

}
