package com.sv.bus.dto;

import java.util.List;

import com.sv.bus.entity.Trips;

import lombok.Data;

@Data
public class BusesDto {
	private Long busId;
	private String busNumber;
	private String busCapacity;
	private String busType;
	private List<Trips> trip;

}
