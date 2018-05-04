package com.example.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.model.Person;

@Component
public class CallRestService implements CommandLineRunner{
	
	//CommandLineRunner Interface allows you to easily run any piece of code after the spring boot app starts up   
	
	private static void callRestService() {
		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject("http://localhost:8080/persons/2", Person.class);
		System.out.println("Person's Name is : "+ person.toString());
		
	}

	@Override
	public void run(String... args) throws Exception {
		this.callRestService();
	}
}
