package com.qa.start;

public class iterations {

	public static void main (String[] args) {
		
		for(int i=0; i<9; i++) {
			if(i==2) {
				continue;
			}
			else if(i==7) {
				break;
			}
			else {
				System.out.println(i);
			}
		} 
	}
}
