package com.sv.bus.dto;

import java.util.List;

import com.sv.bus.entity.Trips;
import lombok.Data;

@Data
public class RoutesDto {
	
	private Long routeId;
	private String fromCity;
	private String toCity;
	private Long distanceKm;
	private List<Trips> trips;

}
