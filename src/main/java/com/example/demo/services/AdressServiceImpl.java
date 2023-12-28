package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Adress;
import com.example.demo.repositories.AdressRepository;
@Service
public class AdressServiceImpl implements AdressService {

	@Autowired
	AdressRepository adressRepository;
	
	
	@Override
	public Adress AddOneAdress(Adress adress) {
		// TODO Auto-generated method stub
		return adressRepository.save(adress);
	}

	@Override
	public List<Adress> getAllAdresses() {
		// TODO Auto-generated method stub
		return adressRepository.findAll();
	}

	@Override
	public Adress findOneAdress(long id) {
		// TODO Auto-generated method stub
		return adressRepository.findById(id).orElse(null);
	}

}
