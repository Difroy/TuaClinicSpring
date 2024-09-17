package com.generation.tuaclinicspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.tuaclinicspring.model.repository.DoctorRepository;

@RestController
@RequestMapping("/clinic/doctors")
public class DoctorApi {

	@Autowired
	DoctorRepository repo;
	


	
	
	
	
	
	
	
	
}
