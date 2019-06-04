package com.qa.interfaces;

import java.util.ArrayList;

public class Animal {

	public static void main (String[] args) {
		Dog dog = new Dog();
		Bees b = new Bees();
		ArrayList<See> sighted = new ArrayList<See>();
		sighted.add(dog);
		sighted.add(b);
		System.out.println(sighted.get(0).sight());
//		for(int i =0; i < sighted.size(); i++)
//		System.out.println(sighted.get(i));
	}
	
	public void live() {
		System.out.println("yay");
	}
		
}
