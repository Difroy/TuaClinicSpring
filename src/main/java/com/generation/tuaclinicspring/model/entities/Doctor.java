package com.generation.tuaclinicspring.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor

{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	// campo di unione, o campo di collegamento e nasconde la chiave esterna.
	//in SQL, chiave esterna. In Spring Data JPA campo di collegamento
	
	@OneToMany(mappedBy="doctor")
	
	
	
	
}
