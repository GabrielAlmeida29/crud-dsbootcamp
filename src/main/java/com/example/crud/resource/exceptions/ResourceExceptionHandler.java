package com.example.crud.resource.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.crud.service.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ResourceExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> notFoundException() {
		
	}
}
