package com.generation.tuaclinicspring.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.tuaclinicspring.model.entities.Patient;
import com.generation.tuaclinicspring.model.repository.PatientRepository;

@RestController
public class PatientAPI {

	
	
	
		@Autowired
		PatientRepository repo;
		
		
		
		@GetMapping("/patients")
		public List<Patient>getPatients(){
			
			return repo.findAll();
		}
		
		
		
		
		
	
	
	
	
	
}
