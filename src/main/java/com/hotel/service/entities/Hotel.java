package com.hotel.service.entities;

import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Hotel {

	@Id
	@Column
	private String hotelId;
	
	private String name;
	
	private String location;
	
	private String about;
}
