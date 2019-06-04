package com.qa.start;

public class Exceptions {
	public static void main (String[] args) {
//		try {
//		int num = 3/0;
//		}catch (ArithmeticException e) {
//			System.out.println("computer exploding noise");
//			System.out.println(e.());
//		}
		method1();
	}
	public static void method1() {
		throw new ArithmeticException();
	}

}
