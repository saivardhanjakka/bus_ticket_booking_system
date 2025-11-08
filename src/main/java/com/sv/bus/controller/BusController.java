package com.sv.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.bus.dto.BusesDto;
import com.sv.bus.service.BusService;

@RestController
@RequestMapping("/api")
public class BusController {
	@Autowired
	private BusService busService;
	@PostMapping("/saveBus")
	public ResponseEntity<String> buses(@RequestBody BusesDto busesDto){
		boolean savedBus=busService.addNewBus(busesDto);
		if(savedBus) {
		
		return new ResponseEntity<String>("sucessfully saved the buses",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("failed to save the buses",HttpStatus.CREATED);
	
		}
		
		
	}
	

}
