package com.generation.tuaclinicspring.model.dto;

import java.util.ArrayList;

public class DoctorDTO {

	
	int id;
	String name;
	String surname;
	Gender gender;
	Specialization specialization;
	List<VaccinationDTO> vaccination = new ArrayList<VaccinationDTO>();
	
	
	
}
