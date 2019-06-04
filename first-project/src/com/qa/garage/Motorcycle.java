package com.qa.garage;

public class Motorcycle extends Vehicle {
	private String wheelThickness;
	
	public Motorcycle(String wheelThickness, String vehicleType) {
		super(vehicleType);
		this.wheelThickness = wheelThickness;
	}
	public String getWheelThickness() {
		return wheelThickness;
	}

}
