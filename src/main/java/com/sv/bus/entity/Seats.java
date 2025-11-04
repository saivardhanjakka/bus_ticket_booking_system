package com.sv.bus.entity;

import com.sv.bus.enums.SeatStatus;
import com.sv.bus.enums.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter

public class Seats {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long seatId;
	private String seatNumber;
	private SeatType seatType;
	private SeatStatus status;
	@ManyToOne
	@JoinColumn(name="trip_id")
	
	private Trips trip;
	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Bookings booking;


}
