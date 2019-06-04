package com.qa.taxes;

public class AppTaxes {

	public static void main (String[] args) {
//		int x = tax(15000);
//		int y = taxPercentage(15000);
		Taxes taxes = new Taxes();
		taxes.tax(15000);
		taxes.taxPercentage(15000);
		
	}
}
