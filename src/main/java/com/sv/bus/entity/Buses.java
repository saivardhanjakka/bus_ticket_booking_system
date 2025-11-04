package com.sv.bus.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Buses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long busId;
	private String busNumber;
	private String busCapacity;
	private String busType;
	@OneToMany(
			mappedBy = "bus", 
			cascade = CascadeType.ALL
	)

	private List<Trips> trip;
	

}
