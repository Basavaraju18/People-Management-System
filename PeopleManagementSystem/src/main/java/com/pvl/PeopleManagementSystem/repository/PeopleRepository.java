package com.pvl.PeopleManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvl.PeopleManagementSystem.entity.People;

public interface PeopleRepository extends JpaRepository<People, Integer>{

}
