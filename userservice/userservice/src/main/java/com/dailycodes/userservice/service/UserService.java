package com.dailycodes.userservice.service;

import java.util.List;

import com.dailycodes.userservice.entities.User;
import com.dailycodes.userservice.exceptions.ResourceNotFoundException;

public interface UserService {
//
	User saveUser(User user);
	
	List<User>getAllUsers();
	
	User getUser(String userId) throws ResourceNotFoundException;
}
