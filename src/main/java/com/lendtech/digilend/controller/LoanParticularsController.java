package com.lendtech.digilend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lendtech.digilend.exceptions.NotFoundException;
import com.lendtech.digilend.model.LoanParticulars;
import com.lendtech.digilend.repository.LoanParticularsRepository;


public class LoanParticularsController {
	

	private final LoanParticularsRepository repository;
    public LoanParticularsController(LoanParticularsRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/loan_details")
	List<LoanParticulars> getLoanDetails(){
		return repository.findAll();
	}
	
	@PostMapping("/loan_details")
	LoanParticulars newLoanDetails(@RequestBody LoanParticulars loanParticulars) {
		return repository.save(loanParticulars);
	}
	
	@GetMapping("/loan_details/{id}")
	LoanParticulars one(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(()-> new NotFoundException("loan details  ",id));
	}
		
	
	@DeleteMapping("loan_details/{id}")
	void deleteLoanDetails(@PathVariable Long id) {
		repository.deleteById(id);
	}
	

}
