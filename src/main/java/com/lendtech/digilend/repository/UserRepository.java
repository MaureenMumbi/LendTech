package com.lendtech.digilend.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendtech.digilend.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findById(int idno);

	Optional<User> findByEmail(String email);

//	Boolean existByidNo(int idno);
//
//
//	Boolean existsByMemberNo(String member_no);
//
//	Boolean existsByEmail(String email);

	  
}


