package com.sv.bus.entity;

import java.util.List;

import com.sv.bus.enums.BookingStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Bookings {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long bookingId;
	private Double totalAmount;
private BookingStatus bookingStatus;
@ManyToOne
@JoinColumn(name="user_id")
private User user;
@ManyToMany
@JoinTable(
		name = "trips_bookings", // Name of the join table
		joinColumns = @JoinColumn(name = "booking_id"), // this table's FK
		inverseJoinColumns = @JoinColumn(name = "trip_id") // other table's FK
	)
private List<Trips> trips;
@OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
private List<Seats> seats;

}

 