package com.qa.garage;

public class Van extends Vehicle {
	private String loadingWeightType;
	
	public Van(String loadingWeight, String vehicleType) {
		super(vehicleType);
		this.loadingWeightType = loadingWeight;
	}
	public String getLoadingWeightType() {
		return loadingWeightType;
	}
	public void loadspace() {
		System.out.println("3");
	}

}
