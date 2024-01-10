package com.pvl.PeopleManagementSystem.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public class PeopleRequest {
	
	@NotNull(message = "People name can't be null")
	private String name;
	
	@NotNull(message = "Gender can't be null")
    @Pattern(regexp = "^(Male|Female|Girl|Boy)$", message = "Gender must be Male, Female, Girl, or Boy")
	private String gender;
	
	
	@Positive(message = "Age can't be negative or zero")
	private int age;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}

/**   the @NotNull annotation ensures that the gender field is not null, and the @Pattern annotation restricts the allowed values using a regular expression. The regular expression "^(Male|Female|Girl|Boy)$" ensures that the gender value must match one of the specified options: "Male," "Female," "Girl," or "Boy." If the gender value does not match any of these options, a validation error message specified in the @Pattern annotation will be triggered.
 * 
 */
