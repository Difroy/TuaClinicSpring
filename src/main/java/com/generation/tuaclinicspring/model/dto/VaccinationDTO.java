package com.generation.tuaclinicspring.model.dto;

import java.time.LocalDate;

import com.generation.tuaclinicspring.model.entities.Vaccination;

public class VaccinationDTO {
	
	int id;
	String vaccine;
	LocalDate date;
	String doctor;
	int doctorId;
	
	
	
	public VaccinationDTO() {}
	
	public VaccinationDTO (Vaccination vaccination) {
		
		this.id = vaccination.getId();
		this.vaccine = vaccination.getVaccine();
		this.date = vaccination.getDate();
		this.doctor = vaccination.getDoctor().getName()+" "+vaccination.getDoctor().getSurname();
		this.doctorId = vaccination.getDoctor().getId();
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	
	

}
