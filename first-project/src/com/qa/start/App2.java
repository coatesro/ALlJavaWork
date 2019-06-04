package com.qa.start;

import java.util.Scanner;

public class App2 {
	
	public static void main (String[] args) {
	int input1 =0;
	int input2 =0;
	play(input1,input2);

	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Enter an integer");
     input1 = in.nextInt();
     System.out.println("Enter another integer");
     input2 = in.nextInt();
	}
	public static void play(int input1, int input2) {

			
		if(input1 > input2 && input1 <= 21) {
			System.out.println(input1);
		}
		else if(input2 >input1 && input2 <= 21) {
			System.out.println(input2);
		}
		else if(input1 > 21 && input2 > 21) {
			System.out.println(0);
		}
		else if (input1 <= 21 && input2 > 21) {
			System.out.println(input2);
		}
		else if (input1 <= 21 && input2 > 21) {
			System.out.println(input2);
		}
		
	}
		
}
