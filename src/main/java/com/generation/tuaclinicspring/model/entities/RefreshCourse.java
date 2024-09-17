package com.generation.tuaclinicspring.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class RefreshCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	
	@ManyToOne
	Doctor doctor;
	
	
	
}
