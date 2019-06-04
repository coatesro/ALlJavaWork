package com.qa.start;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

public static void main(String[] args) {
		
		test();
		input();
		interput();
//		shoplist.add("cheese");
//		shoplist.add("trams");
//		shoplist.add("dogs");
//		
//		System.out.println(shoplist.get(1));
//		shoplist.remove(1);
//		System.out.println(shoplist.get(1));
	}
		public static void test() {
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();


		boolean c = false;
		
		while(c != true) 
		{		
		System.out.println("What would you like to do?");
		String i= input();	
		
		if(i.equals("add")) {
			System.out.println("what name would you like to add");
			String name = input();
			System.out.println("what balance would you like to add");
			int balance = interput();
			BankAccount myItem = new BankAccount(name, balance);
			accounts.add();		
			System.out.println(myItem.name);
			System.out.println(myItem.balance);
			
			
//			String input = input();
//			BankAccount.add(input);			
		}
		else if(i.equals("show")) {
			System.out.println("Pick a name you would like to display?");
			for(BankAccount item: accounts) {
				System.out.println(item);
			}

			
//			for(myItem item: accounts) {
//				System.out.println("these are the items in the list: " + myItem);
//			}
			
		}
		else if (i.equals("delete")) {
			String delete = input();
			accounts.remove(delete);
		}
		else if (i.equals("quit")){
			c = true;
		}
		
		
		}
	}
	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public static int interput() {
		Scanner p = new Scanner(System.in);
		int interput = p.nextInt();
		return interput;
	}

}
