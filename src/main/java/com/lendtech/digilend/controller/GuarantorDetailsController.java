package com.lendtech.digilend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendtech.digilend.exceptions.NotFoundException;
import com.lendtech.digilend.model.GuarantorDetails;
import com.lendtech.digilend.repository.EmploymentDetailsRepository;
import com.lendtech.digilend.repository.GuarantorDetailsRepository;

@RestController
@RequestMapping("/api")
public class GuarantorDetailsController {

	
		
		private final GuarantorDetailsRepository repository;
		public GuarantorDetailsController(GuarantorDetailsRepository repository) {
			this.repository = repository;
		}
		
		@GetMapping("/guarantor")
		List<GuarantorDetails> getGuarantorDetails(){
			return repository.findAll();
		}
		
		@PostMapping("/guarantor")
		GuarantorDetails newGuarantor(@RequestBody GuarantorDetails details) {
			return repository.save(details);
		}
		
		@GetMapping("/guarantor/{id}")
		GuarantorDetails one(@PathVariable Long id) {
			return repository.findById(id).orElseThrow(()-> new NotFoundException("guarantor",id));
		}
			
		
		@DeleteMapping("guarantor/{id}")
		void deleteGuarantor(@PathVariable Long id) {
			repository.deleteById(id);
		}
	
}
