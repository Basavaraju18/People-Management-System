package com.pvl.PeopleManagementSystem.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int peopleId;
	private String peopleName;
	private String peopleGender;
	private int peopleAge;
	it 
	public int getPeopleId() {
		return peopleId;
	}
	public String getPeopleName() {
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	public String getPeopleGender() {
		return peopleGender;
	}
	public void setPeopleGender(String peopleGender) {
		this.peopleGender = peopleGender;
	}
	public int getPeopleAge() {
		return peopleAge;
	}
	public void setPeopleAge(int peopleAge) {
		this.peopleAge = peopleAge;
	}
	@Override
	public String toString() {
		return "People [peopleId=" + peopleId + ", peopleName=" + peopleName + ", peopleGender=" + peopleGender
				+ ", peopleAge=" + peopleAge + "]";
	}
	
	
}
