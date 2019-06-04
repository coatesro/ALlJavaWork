package com.qa.arrayLists;

import java.util.*;

public class ArrayLists {
	

		public  void test() {
		ArrayList<String> shoplist = new ArrayList<String>();


		boolean c = false;
		while(c != true) 
		{		
		System.out.println("What would you like to do?");
		String i= input();	
		if(i.equals("add")) {
			System.out.println("what would you like to add");
			String input = input();
			shoplist.add(input);			
		}
		else if(i.equals("show")) {
			for(String item: shoplist) {
				System.out.println("these are the items in the list: " + item);
			}
			
		}
		else if (i.equals("delete")) {
			String delete = input();
			shoplist.remove(delete);
		}
		else if (i.equals("quit")){
			c = true;
		}
		
		
		}
	}
	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}


}
