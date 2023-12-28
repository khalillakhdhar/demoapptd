package com.example.demo.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person extends Audit implements Serializable {

@Column(nullable = false)
@NotBlank
private String nom,prenom;
@Min(value = 1)
private int age;
@OneToOne(mappedBy = "person",optional = true)
@JsonIgnoreProperties("person")
private Adress adress;
}
