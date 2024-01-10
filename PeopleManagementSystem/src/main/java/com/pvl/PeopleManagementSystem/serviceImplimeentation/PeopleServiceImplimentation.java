package com.pvl.PeopleManagementSystem.serviceImplimeentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pvl.PeopleManagementSystem.dto.PeopleRequest;
import com.pvl.PeopleManagementSystem.dto.PeopleResponse;
import com.pvl.PeopleManagementSystem.entity.People;
import com.pvl.PeopleManagementSystem.repository.PeopleRepository;
import com.pvl.PeopleManagementSystem.service.PeopleService;
import com.pvl.PeopleManagementSystem.utility.ResponsStructure;

@Service
public class PeopleServiceImplimentation implements PeopleService {

	@Autowired
	private PeopleRepository repoPeople;
	
	
	@Override
	public ResponseEntity<ResponsStructure<PeopleResponse>> savePeople(PeopleRequest peopleRequest) {
		People people = new People();
		people.setPeopleName(peopleRequest.getName());
		people.setPeopleGender(peopleRequest.getGender());
		people.setPeopleAge(peopleRequest.getAge());
		
		People people2 = repoPeople.save(people);
		
		PeopleResponse response = new PeopleResponse();
		response.setName(people2.getPeopleName());
		response.setId(people2.getPeopleId());
		response.setGender(people2.getPeopleGender());
		response.setAge(people2.getPeopleAge());
		
		ResponsStructure<PeopleResponse> structure = new ResponsStructure<PeopleResponse>();
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("Datastored successfully!");
		structure.setData(response);
		
		return new ResponseEntity<ResponsStructure<PeopleResponse>>(structure, HttpStatus.CREATED);
	}

	
	@Override
	public ResponseEntity<ResponsStructure<List<People>>> findAllPeople() {
		List<People> list = repoPeople.findAll();
		
		ResponsStructure<List<People>> response = new ResponsStructure<List<People>>();
		response.setMessage("Data getting successfully!");
		response.setStatus(HttpStatus.CREATED.value());
		response.setData(list);
		return new ResponseEntity<ResponsStructure<List<People>>>(response, HttpStatus.OK);
	}
	
	
	@Override
	public ResponseEntity<ResponsStructure<PeopleResponse>> updatePeople(People people, int peopleId) {
		
		return null;
	}


}
