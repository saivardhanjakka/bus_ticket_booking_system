package com.sv.bus.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Trips {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long tripId;
	private String departureTime;
	private String arrivalTime;
	@ManyToOne
	@JoinColumn(name="bus_id")
	private Buses bus;
	@ManyToOne
	@JoinColumn(name="route_id")
	private Routes route;
	@ManyToMany(mappedBy = "trips")
	private List<Bookings> bookings;
	


}
