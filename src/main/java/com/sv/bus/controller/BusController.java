package com.sv.bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<String> buses(@RequestBody BusesDto busesDto) {
		boolean savedBus = busService.addNewBus(busesDto);
		if (savedBus) {

			return new ResponseEntity<String>("sucessfully saved the buses", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("failed to save the buses", HttpStatus.CREATED);

		}

	}
	@GetMapping("/getBuses")
	public ResponseEntity<List<BusesDto>> getBuses() {
		List<BusesDto> busList = busService.getBuses();
		if (busList != null && !busList.isEmpty()) {
			return new ResponseEntity<List<BusesDto>>(busList, HttpStatus.OK);
		}
		return new ResponseEntity<List<BusesDto>>(HttpStatus.NO_CONTENT);
		
    }
	@GetMapping("/getBusById/{busId}")
	public ResponseEntity<BusesDto> getBusesById(@PathVariable Long busId){
		BusesDto busesDto=busService.getBusById(busId);
		if (busesDto != null) {
			return new ResponseEntity<BusesDto>(busesDto, HttpStatus.OK);
		}
		return new ResponseEntity<BusesDto>(HttpStatus.NO_CONTENT);
	}
		@DeleteMapping("/deleteBusById/{busId}")
	public ResponseEntity<String> deleteBusById(@PathVariable Long busId) {
		boolean isDeleted = busService.deleteBusDto(busId);
		if (isDeleted) {
			return new ResponseEntity<String>("sucessfully deleted the bus", HttpStatus.OK);
		}
		return new ResponseEntity<String>("failed to delete the bus", HttpStatus.OK);
	}

}
