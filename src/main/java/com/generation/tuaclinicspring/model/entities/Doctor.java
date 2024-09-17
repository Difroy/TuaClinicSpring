package com.generation.tuaclinicspring.model.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor

{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	// campo di unione, o campo di collegamento e nasconde la chiave esterna.
	//in SQL, chiave esterna. In Spring Data JPA campo di collegamento
	
	@OneToMany(mappedBy="doctor")
	List<Vaccination> vaccinations = new ArrayList<Vaccination>();
	
	String name, surname;
	Specialization specialization;
	Gender gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Vaccination> getVaccinations() {
		return vaccinations;
	}
	public void setVaccinations(List<Vaccination> vaccinations) {
		this.vaccinations = vaccinations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Specialization getSpecialization() {
		return specialization;
	}
	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
}
