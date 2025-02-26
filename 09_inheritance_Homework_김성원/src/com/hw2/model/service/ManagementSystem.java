package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {
	
	abstract void addPerson(Person person);
	
	abstract void removePerson(String id);
	
	abstract void displayAllPersons();
	

}
