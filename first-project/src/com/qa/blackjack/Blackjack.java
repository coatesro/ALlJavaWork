package com.qa.blackjack;

public class Blackjack {
	
	public int play(int numOne, int numTwo) {

		
		if(numOne > numTwo && numOne <= 21) {
			System.out.println(numOne);
		}
		else if(numTwo >numOne && numTwo <= 21) {
			System.out.println(numTwo);
		}
		else if(numOne > 21 && numTwo > 21) {
			System.out.println(0);
		}
		else if (numOne <= 21 && numTwo > 21) {
			System.out.println(numOne);
		}
		else if (numTwo <= 21 && numOne > 21) {
			System.out.println(numTwo);
		}
		return 0;
		
		
		
		
	}

}
