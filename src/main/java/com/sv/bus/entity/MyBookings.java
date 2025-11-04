package com.sv.bus.entity;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;
	import jakarta.persistence.Table;
	import lombok.Getter;
	import lombok.Setter;

	@Getter
	@Setter
	@Entity
	@Table(name="my_bookings")
	public class MyBookings {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer myBookingId;
		private Double unitPrice;
		private Integer quantity;
		

		@ManyToOne
		@JoinColumn(name = "booking_id")
		private Bookings bookings;

	

	}


