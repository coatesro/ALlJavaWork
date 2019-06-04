package com.qa.garage;

public class Car extends Vehicle {
	private String seats;
	
	public Car(String seats, String vehicleType) {
		super(vehicleType);
		this.seats = seats;
	}
	public String getSeats() {
		return seats;
	}

}
