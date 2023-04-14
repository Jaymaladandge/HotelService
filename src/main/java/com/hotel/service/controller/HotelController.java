package com.hotel.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.entities.Hotel;
import com.hotel.service.services.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	private Logger logger = LoggerFactory.getLogger(HotelController.class);
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/save")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		Hotel hotel2 = hotelService.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel2);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id){
		Hotel hotel = hotelService.getHotel(id);
		return ResponseEntity.ok(hotel);
	}
	
	
	@PostMapping
	public ResponseEntity<List<Hotel>> getAllHotels(){
		List<Hotel> hotels =  hotelService.getAllHotels();
		return ResponseEntity.ok(hotels);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
