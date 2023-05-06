package com.dailycodes.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodes.userservice.entities.User;

public interface UserRepo extends JpaRepository<User, String>{

}
