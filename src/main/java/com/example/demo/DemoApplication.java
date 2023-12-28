package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Adress;
import com.example.demo.entities.Person;
import com.example.demo.services.AdressServiceImpl;
import com.example.demo.services.PersonServiceImpl;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	PersonServiceImpl personServiceImpl;
	@Autowired
	AdressServiceImpl adressServiceImpl;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Adress adress1=new Adress("cité el amel","gabés", 3306, null);
		Adress adress2=new Adress("cité zouhour","Sousse", 2006, null);
		Adress adress3=new Adress("cité des fleurs","Kairouane", 1216, null);
		Adress ad1= adressServiceImpl.AddOneAdress(adress1);
		Adress ad2=adressServiceImpl.AddOneAdress(adress2);
		Adress ad3=adressServiceImpl.AddOneAdress(adress3);
		Person p1=new Person("user1", "us1", 20,null);
		Person personne1=personServiceImpl.AddPerson(p1, ad1.getId());
		ad1.setPerson(personne1);
		adressServiceImpl.AddOneAdress(ad1);
//personServiceImpl.getAllPersons().forEach(System.out::println);
		
	}

}
