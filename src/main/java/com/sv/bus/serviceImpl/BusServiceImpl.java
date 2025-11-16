package com.sv.bus.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

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
		
		List<BusesDto> busList=busRepo.findAll().stream().map(bus->modelMapper.map(bus, BusesDto.class)).collect(Collectors.toList());
		return busList;
	}

	@Override
	public BusesDto getBusById(Long busId) {
		Buses buses=busRepo.findById(busId).orElse(null);
		if(buses!=null) {
			return modelMapper.map(buses, BusesDto.class);
		}
		return null;
	}

	@Override
	public boolean deleteBusDto(Long busId) {
		if(busRepo.existsById(busId)) {
			busRepo.deleteById(busId);
			return true;
		}
		return false;
	}

}
