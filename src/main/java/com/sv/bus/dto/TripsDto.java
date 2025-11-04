package com.sv.bus.dto;

import java.util.List;

import com.sv.bus.entity.Bookings;
import com.sv.bus.entity.Buses;
import com.sv.bus.entity.Routes;

import lombok.Data;
@Data
public class TripsDto {
	private Long tripId;
	private String departureTime;
	private String arrivalTime;
	private Buses bus;
	private Routes route;
	private List<Bookings> bookings;

}
