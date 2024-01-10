package com.pvl.PeopleManagementSystem.customexception;

public class PeopleNotFoundException {
	
	private String message;
	
	public PeopleNotFoundException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
