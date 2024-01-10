package com.pvl.PeopleManagementSystem.utility;

public class ResponsStructure<T> {
	
private int status;
	
	private String message;
	
	private T data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}


/** ResponseStructure<T>: This is the generic class declaration. T is the type parameter, and it represents a placeholder for a type that will be specified when an instance of ResponseStructure is created.

private T data;: Here, T is used as the data type for the data variable. This means that when you create an instance of ResponseStructure, you can specify the type of data that the data variable will hold. is  

*/

