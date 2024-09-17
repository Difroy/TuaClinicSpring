package com.generation.tuaclinicspring.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.tuaclinicspring.model.entities.Doctor;
import com.generation.tuaclinicspring.model.entities.Vaccination;
import com.generation.tuaclinicspring.model.repository.DoctorRepository;

@Service
public class VaccinationMapper {

	@Autowired
	DoctorRepository doctorRepo;
	
	
	public VaccinationDTO toDTO (Vaccination vaccination)
	{
		
		
		// VaccinationDTO res = new VaccinationDTO(vaccination)
		//	return res
		return new VaccinationDTO(vaccination);
	}
	
	
	
	
	
	//overloading
	public List<VaccinationDTO> toDTO(List<Vaccination> vaccinations)
	{	
		List<VaccinationDTO> res = new ArrayList<VaccinationDTO>();	
		for(Vaccination v:vaccinations)
			res.add(toDTO(v));
		return res;	
	}
	
	
	
	public Vaccination fromDTO (VaccinationDTO dto)
	{
		
		if(dto.getDoctorId()<=0)
			throw new RuntimeException("Doctor id not valid");
		
		Optional<Doctor> doctorOpt = doctorRepo.findById(dto.getDoctorId());
		if(doctorOpt.isEmpty())
		throw new RuntimeException("Doctor not found");
		
		Vaccination res = new Vaccination();
		res.setId(dto.getId());
		res.setVaccine(dto.getVaccine());
		res.setDate(dto.getDate());
		res.setDoctor(doctorOpt.get());
		
		return res;
		
	}
	
}
