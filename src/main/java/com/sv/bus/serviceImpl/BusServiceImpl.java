package com.sv.bus.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.bus.dto.BusesDto;
import com.sv.bus.entity.Buses;
import com.sv.bus.repository.BusRepository;
import com.sv.bus.service.BusService;
@Service
public class BusServiceImpl implements BusService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private BusRepository busRepo;

	@Override
	public boolean addNewBus(BusesDto busesDto) {
		
		Buses buses=modelMapper.map(busesDto, Buses.class);
		Buses savedBuses=busRepo.save(buses);
		return savedBuses != null;
	}

	@Override
	public List<BusesDto> getBuses() {
		
		
		return null;
	}

	@Override
	public BusesDto getBusById(Long busId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBusDto(Long busId) {
		// TODO Auto-generated method stub
		return false;
	}

}
