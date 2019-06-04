package com.qa.taxes;

public class Taxes {
	
	public int taxPercentage(int percent){
		if (percent >=0 && percent <= 14999) {
			System.out.println("0%");
		}
		else if (percent >= 15000 && percent <= 19999) {
			System.out.println("10%");
		}
		else if (percent >=20000 && percent <=29999) {
			System.out.println("15%");
		}
		else if(percent >=30000 && percent <= 44999) {
			System.out.println("20%");
		}
		else if (percent >= 45000) {
			System.out.println("25%");
		}
		return 0;
	}
	public int tax(int salary) {
	
		if (salary >=0 && salary <= 14999) {
			System.out.println(salary);
		}
		else if (salary >= 15000 && salary <= 19999) {
			System.out.println(salary*1.10);
		}
		else if (salary >=20000 && salary <=29999) {
			System.out.println(salary*1.15);
		}
		else if(salary >=30000 && salary <= 44999) {
			System.out.println(salary*1.20);
		}
		else if (salary >= 45000) {
			System.out.println(salary*1.25);
		}
		return 0;
	}
	

}
