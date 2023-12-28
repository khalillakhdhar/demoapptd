package com.example.demo.services;

import com.example.demo.entities.Adress;
import com.example.demo.entities.Person;

import java.util.List;

public interface PersonService {
	public Person AddPerson(Person person,long idAdress);
	public List<Person> getAllPersons();
	public void deleteOnePerson(long id);
	public Person findOnePerson(long id);
	public List<Person> findPersonsWithAdresses();
	public List<Person> findPersonsWithMinAge(int age);
	public List<Person> filterPersonsWithNames(String nom,String prenom);
	

}
