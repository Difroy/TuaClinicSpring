package com.generation.tuaclinicspring.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.tuaclinicspring.model.dto.VaccinationDTO;
import com.generation.tuaclinicspring.model.dto.VaccinationMapper;
import com.generation.tuaclinicspring.model.entities.Vaccination;
import com.generation.tuaclinicspring.model.repository.VaccinationRepository;

@RestController	
@RequestMapping("clinics/vaccinations")
public class VaccinationAPI {

	@Autowired
	VaccinationMapper mapper;
	
	@Autowired
	VaccinationRepository repo;
	
	@GetMapping	("/{id}")
	public ResponseEntity<VaccinationDTO> getVaccination(@PathVariable ("id") int id){
		
Optional<Vaccination> vaccinationOptional = repo.findById(id);
		
		if(vaccinationOptional.isEmpty())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	
		// 1 - da Optional a Vaccination
		Vaccination v = vaccinationOptional.get();
		// 2 - da Vaccination a VaccinationDTO
		VaccinationDTO dto = mapper.toDTO(v);
		
		// 3 da VaccinationDTO a ResponseEntity<VaccinationDTO>
		ResponseEntity<VaccinationDTO> res = new ResponseEntity<VaccinationDTO>(dto, HttpStatus.OK);
		
		return res;
		
		
	}
	
	@PostMapping()
	public ResponseEntity<Object> insertVaccination(@RequestBody VaccinationDTO dto)
	{
		try
		{
			Vaccination vaccination = mapper.fromDTO(dto);
			repo.save(vaccination);
			return new ResponseEntity<>(mapper.toDTO(vaccination), HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
}
