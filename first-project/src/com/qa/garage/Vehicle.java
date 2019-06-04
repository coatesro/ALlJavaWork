package com.qa.garage;

public class Vehicle {
	private String vehicleType;
	
	public Vehicle(String vehicleType) {
		this.vehicleType = vehicleType;
				
	}
	public String getVehicleType(){
		return vehicleType;
	}
	public void rpm() {
		System.out.println("2000");
	}
	public void noughtToSixty() {
		System.out.println("8");
	}
	public void wheels() {
		System.out.println("4");
	}
	public void type() {
		System.out.println("corsa");
	}
}
