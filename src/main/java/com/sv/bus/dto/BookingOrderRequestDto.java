package com.sv.bus.dto;

import java.util.List;
import lombok.Data;
@Data
public class BookingOrderRequestDto {
	private UserDto userDto;
	
	private BookingsDto booking;
	
	private List<MyBookingsDto> myBookings;
	


}
