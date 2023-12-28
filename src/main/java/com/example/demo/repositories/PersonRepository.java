package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Person;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findByAdressNotNull();
	//List<Person> findByNom(String nom);
	List<Person> findByNomOrPrenom(String nom,String prenom);
	List<Person> findByAgeGreaterThan(int ageMin);
	List<Person> findByAgeLessThan(int AgeLimite);

}
