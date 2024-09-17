package com.generation.tuaclinicspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.tuaclinicspring.model.dto.DoctorDTO;
import com.generation.tuaclinicspring.model.dto.DoctorMapper;
import com.generation.tuaclinicspring.model.entities.Doctor;
import com.generation.tuaclinicspring.model.repository.DoctorRepository;

@RestController
@RequestMapping("/clinic/doctors")
public class DoctorApi {

	@Autowired
	DoctorRepository repo;
	
	@Autowired
	DoctorMapper mapper;
	
	
	@GetMapping("/{id}")
	public DoctorDTO getDoctor(@PathVariable("id") int id) {
		
		Doctor d = repo.findById(id).get();
		return mapper.toDTO(d);
	}
	
	
	
	
	
	
	
	
}
