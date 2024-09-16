package com.generation.tuaclinicspring.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.generation.tuaclinicspring.model.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository <Patient, Long> {

	
	
	List<Patient> getPatientBySurname(String surname);
	List<Patient> getPatientByGender (String gender);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
