package com.lendtech.digilend.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lendtech.digilend.model.User;
import com.lendtech.digilend.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		User user = userRepository.findByEmail(email)
//				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + email));
//
//		System.out.println(user.getEmail() + "||||" + user.getPassword());

		User user = userRepository.findByEmail(email);

		if (user == null)
			throw new UsernameNotFoundException("Bad credentials");

		System.out.println(user.getEmail() + "~~~~~~" + user.getPassword());

		return UserDetailsImpl.build(user);
	}


}