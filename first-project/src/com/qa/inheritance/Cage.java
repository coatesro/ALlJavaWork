package com.qa.inheritance;

public class Cage<T extends Animal/*, Ttwo*/> {

	private T myItem;
//	private Ttwo mySecondItem;
	
	public T getItem() {
		return this.myItem;
	}
	public void setItem(T input) {
		this.myItem = input;
	}
//	public Ttwo getItemT2() {
//		return this.mySecondItem;
//	}
//	public void setItemT2(Ttwo input) {
//		this.mySecondItem = input;
//	}
	public static void main(String[]args) {
		Cage<Animal> myCage = new Cage<Animal>();
		myCage.setItem();
		System.out.println(myCage.getItem());
	}
}

