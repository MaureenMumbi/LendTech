package com.lendtech.digilend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendtech.digilend.exceptions.NotFoundException;
import com.lendtech.digilend.model.EmploymentDetails;
import com.lendtech.digilend.repository.EmploymentDetailsRepository;


@RestController
@RequestMapping("/api")
public class EmploymentDetailsController {
	
	private final EmploymentDetailsRepository repository;
	public EmploymentDetailsController(EmploymentDetailsRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/employment_details")
	List<EmploymentDetails> getEmploymentDetails(){
		return repository.findAll();
	}
	
	@PostMapping("/employment_details")
	EmploymentDetails newDetails(@RequestBody EmploymentDetails details) {
		
		return repository.save(details);
	}
	
	@GetMapping("/employment_details/{id}")
	EmploymentDetails one(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(()-> new NotFoundException("employment_details", id));
	}
		
	
	@DeleteMapping("employment_details/{id}")
	void deleteEmploymentDetails(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("employment_details/{id}")
	EmploymentDetails updateEmploymentDetails(@RequestBody EmploymentDetails updateddetails, @PathVariable Long id) {
		
		return repository.findById(id).map(
				employment_details -> {
					employment_details.setEmployer(updateddetails.getEmployer());
					employment_details.setBusiness_type(updateddetails.getBusiness_type());
		return repository.save(employment_details);
		}).orElseGet(() -> {
			updateddetails.setLoan_id(id);
			return repository.save(updateddetails);
		});
	}
	

}
