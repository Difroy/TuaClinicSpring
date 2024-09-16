package com.generation.tuaclinicspring.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.generation.tuaclinicspring.model.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository <Patient, Long> {

	
	
	List<Patient> findPatientBySurname(String surname);
	List<Patient> findPatientByGender (String gender);
	List<Patient> findPatientByAge (int age);
	List<Patient> findPatientByNameAndSurname (String name, String surname);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
