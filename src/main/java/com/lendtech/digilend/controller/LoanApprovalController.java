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
import com.lendtech.digilend.model.LoanApprovals;
import com.lendtech.digilend.repository.LoanApprovalRepository;

@RestController
@RequestMapping("/api")
public class LoanApprovalController {
	
	private final LoanApprovalRepository repository;
	public LoanApprovalController(LoanApprovalRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/approval")
	List<LoanApprovals> getApprovalDetails(){
		return repository.findAll();
	}
	
	@PostMapping("/approval")
	LoanApprovals newApproval(@RequestBody LoanApprovals approval) {
		return repository.save(approval);
	}
	
	@GetMapping("/approval/{id}")
	LoanApprovals one(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(()-> new NotFoundException("approvals",id));
	}
		
	
	@DeleteMapping("approval/{id}")
	void deleteLoanApproval(@PathVariable Long id) {
		repository.deleteById(id);
	}


}
