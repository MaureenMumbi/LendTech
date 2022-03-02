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
@Table(name="employment_details")
public class EmploymentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loan_id;
	
	@Column(name="user_id")
	private Integer user_id;
	
	
	@Column(name = "type", nullable=false)
	private String type;
	
	@Column(name = "employer")
	private String employer;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="physical_address", nullable=false)
	private String physical_address;
	
	@Column(name="street")
	private String street;
	
	
	@Column(name = "business_type")
	private String business_type;  
	
	@Column(name="years_in_operation")
	private String years_in_operation;

	
	@Column(name="monthly_income")
	private float monthly_business_income;
	
	
	@Column(name="rental_income")
	private float rental_income;
	
	@Column(name="other_income")
	private float other_income;
	
	
	@CreatedDate
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime created_date;
	
	@LastModifiedDate
	@Column(name = "modified_date")
	private LocalDateTime modified_date;
	
	
	
	

	public long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhysical_address() {
		return physical_address;
	}

	public void setPhysical_address(String physical_address) {
		this.physical_address = physical_address;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBusiness_type() {
		return business_type;
	}

	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}

	public String getYears_in_operation() {
		return years_in_operation;
	}

	public void setYears_in_operation(String years_in_operation) {
		this.years_in_operation = years_in_operation;
	}

	public float getMonthly_business_income() {
		return monthly_business_income;
	}

	public void setMonthly_business_income(float monthly_business_income) {
		this.monthly_business_income = monthly_business_income;
	}

	public float getRental_income() {
		return rental_income;
	}

	public void setRental_income(float rental_income) {
		this.rental_income = rental_income;
	}

	public float getOther_income() {
		return other_income;
	}

	public void setOther_income(float other_income) {
		this.other_income = other_income;
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
		return Objects.hash(business_type, created_date, designation, employer, loan_id, modified_date,
				monthly_business_income, other_income, physical_address, rental_income, street, type, user_id,
				years_in_operation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmploymentDetails other = (EmploymentDetails) obj;
		return Objects.equals(business_type, other.business_type) && Objects.equals(created_date, other.created_date)
				&& Objects.equals(designation, other.designation) && Objects.equals(employer, other.employer)
				&& loan_id == other.loan_id && Objects.equals(modified_date, other.modified_date)
				&& Float.floatToIntBits(monthly_business_income) == Float.floatToIntBits(other.monthly_business_income)
				&& Float.floatToIntBits(other_income) == Float.floatToIntBits(other.other_income)
				&& Objects.equals(physical_address, other.physical_address)
				&& Float.floatToIntBits(rental_income) == Float.floatToIntBits(other.rental_income)
				&& Objects.equals(street, other.street) && Objects.equals(type, other.type)
				&& Objects.equals(user_id, other.user_id)
				&& Objects.equals(years_in_operation, other.years_in_operation);
	}

	@Override
	public String toString() {
		return "EmploymentDetails [loan_id=" + loan_id + ", user_id=" + user_id + ", type=" + type + ", employer="
				+ employer + ", designation=" + designation + ", physical_address=" + physical_address + ", street="
				+ street + ", business_type=" + business_type + ", years_in_operation=" + years_in_operation
				+ ", monthly_business_income=" + monthly_business_income + ", rental_income=" + rental_income
				+ ", other_income=" + other_income + ", created_date=" + created_date + ", modified_date="
				+ modified_date + "]";
	}
	
	
	
	
	
	
	

}
