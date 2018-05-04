package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	List<Person> findByAge(int age);
	
	List<Person> findByFirstName(String firstName);
	
}
