package com.hotel.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hotel.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex){
		String msg = ex.getMessage();
		ApiResponse apiResponse = ApiResponse.builder().msg(msg).status(true).httpStatus(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiResponse);
	}
}
