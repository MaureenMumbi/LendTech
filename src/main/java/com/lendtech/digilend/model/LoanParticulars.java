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
@Table(name="loan_particulars")
public class LoanParticulars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="loan_id", nullable=false)
	private Integer loan_id;
	
	
	@Column(name="loan_type", nullable=false)
	private String loan_type;
	
	@Column(name="disbursement_mode", nullable=false)
	private String disbursement_mode;
	
	@Column(name="disburse_to", nullable=false)
	private String disburse_to;
	
	@Column(name="loan_amount", nullable=false)
	private float loan_amount;
	
	@Column(name="repayment_period", nullable=false)
	private String repayment_period;
	
	
	@Column(name="recovery_mode", nullable=false)
	private String recovery_mode;
	
	@Column(name="monthly_repayment_amount", nullable=false)
	private float monthly_repayment_amount;
	
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

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public String getDisbursement_mode() {
		return disbursement_mode;
	}

	public void setDisbursement_mode(String disbursement_mode) {
		this.disbursement_mode = disbursement_mode;
	}

	public String getDisburse_to() {
		return disburse_to;
	}

	public void setDisburse_to(String disburse_to) {
		this.disburse_to = disburse_to;
	}

	public float getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(float loan_amount) {
		this.loan_amount = loan_amount;
	}

	public String getRepayment_period() {
		return repayment_period;
	}

	public void setRepayment_period(String repayment_period) {
		this.repayment_period = repayment_period;
	}

	public String getRecovery_mode() {
		return recovery_mode;
	}

	public void setRecovery_mode(String recovery_mode) {
		this.recovery_mode = recovery_mode;
	}

	public float getMonthly_repayment_amount() {
		return monthly_repayment_amount;
	}

	public void setMonthly_repayment_amount(float monthly_repayment_amount) {
		this.monthly_repayment_amount = monthly_repayment_amount;
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
		return Objects.hash(created_date, disburse_to, disbursement_mode, id, loan_amount, loan_id, loan_type,
				modified_date, monthly_repayment_amount, recovery_mode, repayment_period);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanParticulars other = (LoanParticulars) obj;
		return Objects.equals(created_date, other.created_date) && Objects.equals(disburse_to, other.disburse_to)
				&& Objects.equals(disbursement_mode, other.disbursement_mode) && id == other.id
				&& Float.floatToIntBits(loan_amount) == Float.floatToIntBits(other.loan_amount)
				&& Objects.equals(loan_id, other.loan_id) && Objects.equals(loan_type, other.loan_type)
				&& Objects.equals(modified_date, other.modified_date)
				&& Float.floatToIntBits(monthly_repayment_amount) == Float
						.floatToIntBits(other.monthly_repayment_amount)
				&& Objects.equals(recovery_mode, other.recovery_mode)
				&& Objects.equals(repayment_period, other.repayment_period);
	}

	@Override
	public String toString() {
		return "LoanParticulars [id=" + id + ", loan_id=" + loan_id + ", loan_type=" + loan_type
				+ ", disbursement_mode=" + disbursement_mode + ", disburse_to=" + disburse_to + ", loan_amount="
				+ loan_amount + ", repayment_period=" + repayment_period + ", recovery_mode=" + recovery_mode
				+ ", monthly_repayment_amount=" + monthly_repayment_amount + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
