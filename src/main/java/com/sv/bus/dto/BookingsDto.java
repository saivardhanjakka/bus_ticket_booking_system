package com.sv.bus.dto;

import java.util.List;

import com.sv.bus.entity.Seats;
import com.sv.bus.entity.Trips;
import com.sv.bus.entity.User;
import com.sv.bus.enums.BookingStatus;

import lombok.Data;

@Data
public class BookingsDto {
private Long bookingId;
private Double totalAmount;
private BookingStatus bookingStatus;
private User user;
private List<Trips> trips;
private List<Seats> seats;

}
