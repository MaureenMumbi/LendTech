package com.lendtech.digilend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendtech.digilend.model.LoanApprovals;

public interface LoanApprovalRepository extends JpaRepository<LoanApprovals, Long> {

}
