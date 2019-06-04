package com.qa.inheritance;

public class Monkey extends Animal {
	private int limbs;
	
	public Monkey(int limbs, int age) {
		super(age);
		this.limbs = limbs;
	}
	public int getLimbs(){
		return limbs;
	}
	public void climb() {
		System.out.println("wowie");
	}
	public void noise() {
		System.out.println("oo ee aa aa");
	}
}
