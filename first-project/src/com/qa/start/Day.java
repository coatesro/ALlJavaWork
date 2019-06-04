package com.qa.start;

public enum Day {
	MONDAY ("not great"),
	TUESDAY ("mediocre"),
	WEDNESDAY("dead");
	
	private String feeling;
	
	Day (String feeling){
		this.feeling = feeling;
	}
	public String getFeeling() {
		return feeling;
	}
	
}
