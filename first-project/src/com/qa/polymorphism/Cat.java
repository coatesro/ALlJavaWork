package com.qa.polymorphism;

public class Cat {
	private String look;
	private String name;

public Cat(String look, String name) {
	this.look = look;
	this.name = name;
	System.out.println("has a home");
}
public Cat (String look) {
	this.look = look;
	System.out.println("is a stray");
}
}