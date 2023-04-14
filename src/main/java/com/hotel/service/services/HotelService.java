package com.hotel.service.services;

import java.util.List;

import com.hotel.service.entities.Hotel;

public interface HotelService {

	Hotel saveHotel(Hotel hotel);
	
	List<Hotel> getAllHotels();
	
	Hotel getHotel(String id);
}
