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
@Table(name="guarantor_details")
public class GuarantorDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="loan_id")
	private Integer loan_id;
	
	@Column(name="member_id")
	private String member_id;
	
	@Column(name="member_name")
	private String member_name;
	
	
	@Column(name="phone_no")
	private String phone_no;
	
	@Column(name="amount")
	private String amount;
	
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

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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
		return Objects.hash(amount, created_date, id, loan_id, member_id, member_name, modified_date, phone_no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuarantorDetails other = (GuarantorDetails) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(created_date, other.created_date)
				&& id == other.id && Objects.equals(loan_id, other.loan_id)
				&& Objects.equals(member_id, other.member_id) && Objects.equals(member_name, other.member_name)
				&& Objects.equals(modified_date, other.modified_date) && Objects.equals(phone_no, other.phone_no);
	}

	@Override
	public String toString() {
		return "GuarantorDetails [id=" + id + ", loan_id=" + loan_id + ", member_id=" + member_id + ", member_name="
				+ member_name + ", phone_no=" + phone_no + ", amount=" + amount + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + "]";
	}
	
	
	

}
