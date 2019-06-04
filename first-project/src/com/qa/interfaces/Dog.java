package com.qa.interfaces;

public class Dog extends Animal implements See {
	
	public Dog() {
	}
	
	public void bark() {
		System.out.println("bark bark");
	} 
	public void sight() {
		System.out.println(" black and white");
	};
	public void eyes() {
		System.out.println("puppy eyes");
	};

}
