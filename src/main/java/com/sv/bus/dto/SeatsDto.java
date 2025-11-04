package com.sv.bus.dto;

import com.sv.bus.entity.Trips;
import com.sv.bus.enums.SeatStatus;
import com.sv.bus.enums.SeatType;
import lombok.Data;

@Data
public class SeatsDto {
	private Long seatId;
	private String seatNumber;
	private SeatType seatType;
	private SeatStatus status;
	private Trips trip;
	
}
