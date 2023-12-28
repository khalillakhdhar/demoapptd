package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Adress;

public interface AdressService {
public Adress AddOneAdress(Adress adress);
public List<Adress> getAllAdresses();
public Adress findOneAdress(long id);

}
