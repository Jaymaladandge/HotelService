package com.hotel.service.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staffs")
public class StaffController {

	private Logger logger = LoggerFactory.getLogger(StaffController.class);
	
	@GetMapping
	public ResponseEntity<List<String>> getStaffs() {
		List<String> staffs = Arrays.stream(new String[] { "Ram", "Shyam", "Geeta", "Seeta" }).toList();
		return ResponseEntity.ok(staffs);
	}

}
