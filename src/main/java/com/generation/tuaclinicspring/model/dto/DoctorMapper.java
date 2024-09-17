package com.generation.tuaclinicspring.model.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.tuaclinicspring.model.entities.Doctor;
@Service
public class DoctorMapper {

	@Autowired
	VaccinationMapper vaccinationMapper;
	
	public DoctorDTO toDTO (Doctor doctor) {
		
		DoctorDTO dto = new DoctorDTO();
		
		dto.setId(doctor.getId());
		dto.setName(doctor.getName());
		dto.setSurname(doctor.getSurname());
		dto.setGender(doctor.getGender());
		dto.setSpecialization(doctor.getSpecialization());
		dto.setVaccination(vaccinationMapper.toDTO(doctor.getVaccinations()));
		//					 List<VaccinationDTO> 	List<Vaccination>
		
		return dto;
	}
	
	
}
