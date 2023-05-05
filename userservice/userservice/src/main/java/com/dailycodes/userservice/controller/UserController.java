package com.dailycodes.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodes.userservice.entities.User;
import com.dailycodes.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping("/add")
public ResponseEntity<User>saveUser(@RequestBody User user){
	User u=service.saveUser(user);
	return new ResponseEntity<User>(user,HttpStatus.CREATED);
}
	@GetMapping("/allUsers")
	public ResponseEntity<List<User>>getAllUsers(){
		List<User> users = service.getAllUsers();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	public String getName() {
		return "Test Welcome";
	}
}
