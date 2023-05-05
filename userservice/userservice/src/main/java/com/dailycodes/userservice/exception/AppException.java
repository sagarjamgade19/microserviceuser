package com.dailycodes.userservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dailycodes.userservice.exceptions.ResourceNotFoundException;

@RestControllerAdvice
public class AppException {
@ExceptionHandler(ResourceNotFoundException.class)
public ResponseEntity<?> handleResourceNotFoundEx(ResourceNotFoundException exception){
	return null;
}
}
