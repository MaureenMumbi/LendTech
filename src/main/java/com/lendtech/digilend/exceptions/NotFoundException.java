package com.lendtech.digilend.exceptions;

public class NotFoundException extends RuntimeException {
	
	public NotFoundException(String type, Long id){
		super("Could not find "+ type +": "+id);
	}

}
