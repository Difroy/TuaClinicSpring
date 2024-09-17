package com.generation.tuaclinicspring.model.dto;

import java.util.ArrayList;
import java.util.List;

import com.generation.tuaclinicspring.model.entities.Gender;
import com.generation.tuaclinicspring.model.entities.Specialization;

public class DoctorDTO {

	
	int id;
	String name;
	String surname;
	Gender gender;
	Specialization specialization;
	List<VaccinationDTO> vaccination = new ArrayList<VaccinationDTO>();
	
	
	public DoctorDTO() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public Specialization getSpecialization() {
		return specialization;
	}


	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}


	public List<VaccinationDTO> getVaccination() {
		return vaccination;
	}


	public void setVaccination(List<VaccinationDTO> vaccination) {
		this.vaccination = vaccination;
	}
	
	
	
	
}
