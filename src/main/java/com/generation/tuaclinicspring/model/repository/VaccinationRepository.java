package com.generation.tuaclinicspring.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.tuaclinicspring.model.entities.Vaccination;



public interface VaccinationRepository extends JpaRepository <Vaccination, Integer>
{

	
	
}
