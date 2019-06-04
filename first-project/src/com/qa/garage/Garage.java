package com.qa.garage;

import java.util.ArrayList;

public class Garage {
	public static void main(String[] ags) {
		
		Car car = new Car("leather", "corsa");
		Motorcycle motorcycle = new Motorcycle("15cm", "turbo");
		Van van = new Van("heavy", "transporter");
		Vehicle fiat = new Car("cushiony", "punto");
		Vehicle toyota = new Car("suede","corola");
		
//		Vehicle ford = (Vehicle) van;
//		Vehicle kawasaki = (Vehicle) motorcycle;
		
//		Car someCar = (Car) car;
//		Motorcycle someMotorcycle = (Motorcycle) motorcycle;
//		Van someVan = (Van) van;

		car.getSeats();
		motorcycle.getWheelThickness();
		van.getLoadingWeightType();
		car.getVehicleType();
		motorcycle.getVehicleType();
		van.getVehicleType();
		
//		System.out.println(car.getSeats());
//		System.out.println(motorcycle.getWheelThickness());
//		System.out.println(van.getLoadingWeightType());
//		System.out.println(car.getVehicleType());
//		System.out.println(motorcycle.getVehicleType());
//		System.out.println(van.getVehicleType());
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(fiat);
		vehicleList.add(toyota);
		
		for (int x = 0; x < vehicleList.size(); x++)
		    System.out.println(vehicleList.get(0));
		
		

		}
		
	}

