package com.example.service;

import java.util.Hashtable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonService {
	Hashtable<String,Person> persons = new Hashtable<String,Person>();
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	PersonRepository personRepository;
	
	public PersonService() {
		
	}
	
	public Person getPerson(Long id) {
		return  personRepository.findById(id).orElse(null);
	}
	
	public List<Person> getAll(){
		return (List<Person>) personRepository.findAll();
	}
}
