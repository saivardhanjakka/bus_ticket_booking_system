package com.sv.bus.service;

import java.util.List;

import com.sv.bus.dto.BusesDto;

public interface BusService {
	
	public boolean addNewBus(BusesDto busesDto);
	public List<BusesDto> getBuses();
	public BusesDto getBusById(Long busId);
	public boolean deleteBusDto(Long busId);

}
