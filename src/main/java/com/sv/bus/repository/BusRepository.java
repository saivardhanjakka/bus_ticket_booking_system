package com.sv.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sv.bus.entity.Buses;

@Repository
public interface BusRepository extends JpaRepository<Buses,Long> {
	
	

}
