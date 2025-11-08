package com.sv.bus.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.bus.dto.RoutesDto;
import com.sv.bus.entity.Routes;
import com.sv.bus.repository.RoutesRepository;
import com.sv.bus.service.RoutesService;
@Service
public class RoutesServiceImpl implements RoutesService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private RoutesRepository routesRepo;

	@Override
	public boolean saveRoutes(RoutesDto routesDto) {
		Routes routes=modelMapper.map(routesDto, Routes.class);
		Routes savedRoutes=routesRepo.save(routes);
		return savedRoutes!=null;
	}

}
