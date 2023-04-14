package com.hotel.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("No resource found on server...!");
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
