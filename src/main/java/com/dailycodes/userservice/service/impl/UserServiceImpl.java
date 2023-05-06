package com.dailycodes.userservice.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodes.userservice.entities.User;
import com.dailycodes.userservice.exceptions.ResourceNotFoundException;
import com.dailycodes.userservice.repo.UserRepo;
import com.dailycodes.userservice.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomId=UUID.randomUUID().toString();
		user.setUserId(randomId);
		return repo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User getUser(String userId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return repo.findById(userId).orElseThrow(()->new ResourceNotFoundException("No Record Found With given Id"+userId));
	}

}
