package com.example.demo.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Adress extends Audit implements Serializable{
@Column(nullable = false)
private String rue,ville;
@Column(nullable = false,length = 4)
private long codepostale;
@OneToOne(fetch = FetchType.EAGER)
@JsonIgnoreProperties("adress")
private Person person;
}
