package com.lendtech.digilend.payload.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
public class SignupRequest {


	private int id_no;

	@NotBlank
	private String member_no;
 
    @NotBlank
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

	private String first_name;
	private String last_name;
	private boolean is_member;

	public int getId_no() {
		return id_no;
	}

	public void setId_no(int id_no) {
		this.id_no = id_no;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public boolean isIs_member() {
		return is_member;
	}

	public void setIs_member(boolean is_member) {
		this.is_member = is_member;
	}

//	public int getIdno() {
//		return id_no;
//	}
//
//	public void setIdno(int idno) {
//		this.id_no = idno;
//	}
//
//	public String getMemberno() {
//		return member_no;
//	}
//
//	public void setMemberno(String memberno) {
//		this.member_no = memberno;
//	}
//
//	public String getFirst_name() {
//		return first_name;
//	}
//
//	public void setFirst_name(String first_name) {
//		this.first_name = first_name;
//	}
//
//	public String getLast_name() {
//		return last_name;
//	}
//
//	public void setLast_name(String last_name) {
//		this.last_name = last_name;
//	}
//
//    public String getEmail() {
//        return email;
//    }
// 
//    public void setEmail(String email) {
//        this.email = email;
//    }
// 
//    public String getPassword() {
//        return password;
//    }
// 
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    
//    public Set<String> getRole() {
//      return this.role;
//    }
//    
//    public void setRole(Set<String> role) {
//      this.role = role;
//    }
//
//	public boolean isIs_member() {
//		return is_member;
//	}
//
//	public void setIs_member(boolean is_member) {
//		this.is_member = is_member;
//	}
}
