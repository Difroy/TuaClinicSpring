package com.generation.tuaclinicspring.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.tuaclinicspring.model.entities.Patient;
import com.generation.tuaclinicspring.model.repository.PatientRepository;



/**
 * La classe PatientAPI è annotata con @RestController,
 * quindi classe gestirà le richieste HTTP e le risposte
 * JSON, rendendola un controller RESTful.
 * */
@RestController 
public class PatientAPI {
	
	
	
	@Autowired //  <------------   Dependency Injection
	/**Il repository PatientRepository è iniettato nella classe
	 *tramite l'annotazione @Autowired. Spring gestisce
	 *automaticamente la creazione e l'inizializzazione di repo,
	 *collegandolo a un'istanza di JpaRepository.*/
	PatientRepository repo;

	
	
	
	
	
	// C in CRUD
	@PostMapping("/patients")
	public Patient newPatient(@RequestBody Patient newPatient) {
		return repo.save(newPatient);
	}

	// R in CRUD
	@GetMapping("/patients")
	public List<Patient> getPatients() {
		return repo.findAll();
	}

	// U in CRUD
	@PutMapping("/patients")
	public Patient updatePatient(@RequestBody Patient newPatient) {

		return repo.save(newPatient);

	}

	// D in CRUD
	@DeleteMapping("/patients/{id}")
	public void deletePatient(@PathVariable("id") long id) {

		repo.deleteById(id);

	}
	
	
	

}