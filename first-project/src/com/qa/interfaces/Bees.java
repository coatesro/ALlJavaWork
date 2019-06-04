package com.qa.interfaces;

public class Bees extends Animal implements Fly,See {
	public void bumble() {
		System.out.println("buzz buzz");
	}
	public void flap() {
		System.out.println("flap flap");
	}
	public void sight() {
		System.out.println("ultraviolet");
	};
	public void eyes() {
		System.out.println("bee eyes");
	};
}
