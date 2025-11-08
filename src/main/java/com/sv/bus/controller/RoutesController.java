package com.sv.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sv.bus.dto.RoutesDto;
import com.sv.bus.service.RoutesService;

@RestController
@RequestMapping("/api")
public class RoutesController {
	@Autowired
	private RoutesService routesService;
	@PostMapping("/saveRoutes")
	public ResponseEntity<String> saveRoutes(@RequestBody RoutesDto routesDto){
		
		boolean isSaved=routesService.saveRoutes(routesDto);
		if(isSaved) {
			return new ResponseEntity<String>("saved succesfully",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("failed to save",HttpStatus.CREATED);

		}
		
	}

}
