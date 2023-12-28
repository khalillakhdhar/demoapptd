package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Adress;
import com.example.demo.entities.Person;
import com.example.demo.repositories.AdressRepository;
import com.example.demo.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
// injection
	@Autowired
	PersonRepository personRepository;
	@Autowired
	AdressRepository adressRepository;
	
	
	
	@Override
	public Person AddPerson(Person person,long idAdress) {
		// TODO Auto-generated method stub
		Adress adr=adressRepository.findById(idAdress).orElse(null);
		person.setAdress(adr);
		
		
		
		
		return personRepository.save(person);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	public void deleteOnePerson(long id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);

	}

	@Override
	public Person findOnePerson(long id) {
		// TODO Auto-generated method stub
		return personRepository.findById(id).orElse(null);
	}

	@Override
	public List<Person> findPersonsWithAdresses() {
		// TODO Auto-generated method stub
		return personRepository.findByAdressNotNull();
	}

	@Override
	public List<Person> findPersonsWithMinAge(int age) {
		// TODO Auto-generated method stub
		return personRepository.findByAgeGreaterThan(age);
	}

	@Override
	public List<Person> filterPersonsWithNames(String nom, String prenom) {
		// TODO Auto-generated method stub
		return personRepository.findByNomOrPrenom(nom, prenom);
	}

}
