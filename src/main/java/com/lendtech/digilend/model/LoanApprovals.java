package com.lendtech.digilend.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name="loan_approvals")
public class LoanApprovals {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="loan_id",nullable=false)
	private Integer loan_id;
	
	@Column(name="status", nullable=false)
	private String status;
	
	@CreatedDate
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime created_date;
	
	@LastModifiedDate
	@Column(name = "modified_date")
	private LocalDateTime modified_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(Integer loan_id) {
		this.loan_id = loan_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}

	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(created_date, id, loan_id, modified_date, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanApprovals other = (LoanApprovals) obj;
		return Objects.equals(created_date, other.created_date) && id == other.id
				&& Objects.equals(loan_id, other.loan_id) && Objects.equals(modified_date, other.modified_date)
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "LoanApprovals [id=" + id + ", loan_id=" + loan_id + ", status=" + status + ", created_date="
				+ created_date + ", modified_date=" + modified_date + "]";
	}
	
	
	

}
