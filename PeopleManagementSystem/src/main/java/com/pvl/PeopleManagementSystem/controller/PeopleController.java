package com.pvl.PeopleManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pvl.PeopleManagementSystem.dto.PeopleRequest;
import com.pvl.PeopleManagementSystem.dto.PeopleResponse;
import com.pvl.PeopleManagementSystem.entity.People;
import com.pvl.PeopleManagementSystem.service.PeopleService;
import com.pvl.PeopleManagementSystem.utility.ResponsStructure;

@RestController
@CrossOrigin("http://localhost:3000")
public class PeopleController {
	
	@Autowired
	private PeopleService service;
	
	
	@CrossOrigin
	@PostMapping("people/save")
	public ResponseEntity<ResponsStructure<PeopleResponse>> savePeople(@RequestBody PeopleRequest peopleReq){
		return service.savePeople(peopleReq);
	}
	
	@CrossOrigin
	@GetMapping("/people/getall")
	public ResponseEntity<ResponsStructure<List<People>>> findAll(){
		return service.findAllPeople();
	}
	

}
