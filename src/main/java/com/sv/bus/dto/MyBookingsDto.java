package com.sv.bus.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class MyBookingsDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookingId;
	private Double unitPrice;
	private Integer quantity;
	

	@ManyToOne
	@JoinColumn(name = "booking_id")
	private BookingsDto bookings;



}


