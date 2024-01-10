package com.pvl.PeopleManagementSystem.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pvl.PeopleManagementSystem.utility.ErrorStructure;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<ErrorStructure> peopleNotFoundId(PeopleNotFoundException exception){
		ErrorStructure error= new ErrorStructure();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage("student not found");
		error.setRootCause(exception.getMessage());

		return new ResponseEntity<ErrorStructure>(error,HttpStatus.NOT_FOUND);
		
	}
}
