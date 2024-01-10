package com.pvl.PeopleManagementSystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.pvl.PeopleManagementSystem.dto.PeopleRequest;
import com.pvl.PeopleManagementSystem.dto.PeopleResponse;
import com.pvl.PeopleManagementSystem.entity.People;
import com.pvl.PeopleManagementSystem.utility.ResponsStructure;

public interface PeopleService {
	
	public ResponseEntity<ResponsStructure<PeopleResponse>> savePeople(PeopleRequest peopleRequest); 
	
	public ResponseEntity<ResponsStructure<List<People>>> findAllPeople();   
	
	public ResponseEntity<ResponsStructure<PeopleResponse>> updatePeople(People people, int peopleId);   

}
