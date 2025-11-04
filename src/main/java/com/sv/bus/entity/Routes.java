package com.sv.bus.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Routes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long routeId;
	private String fromCity;
	private String toCity;
	private Long distanceKm;
	@OneToMany(
			mappedBy = "route", 
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
	)

	private List<Trips> trips;
	

}
