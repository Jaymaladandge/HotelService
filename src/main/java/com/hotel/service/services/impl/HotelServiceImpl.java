package com.hotel.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.entities.Hotel;
import com.hotel.service.exceptions.ResourceNotFoundException;
import com.hotel.service.repositories.HotelRepository;
import com.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	
	private Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		hotel.setHotelId(UUID.randomUUID().toString());
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		logger.info("findUserDetailsById-Id=");
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String hotelId) {
		logger.info("findUserDetailsById-Id=" + hotelId);
		return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel with given id not found on server..."));
	}

}
