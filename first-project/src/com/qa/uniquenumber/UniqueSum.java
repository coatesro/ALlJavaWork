package com.qa.uniquenumber;

public class UniqueSum {

	public int sum(int numOne, int numTwo, int numThree) {
		
		if(numOne == numTwo) {
			System.out.println(numThree);
		}
		else if (numOne == numThree) {
			System.out.println(numTwo);
		}
		else if(numTwo == numThree) {
			System.out.println(numOne);
		}
		else {
			System.out.println(numOne + numTwo + numThree);
		}
		return 0;
	}
}
