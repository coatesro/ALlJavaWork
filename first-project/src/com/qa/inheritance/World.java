package com.qa.inheritance;

import java.util.ArrayList;

public class World {
		public static void main(String[] args) {
//			Animal ani = new Fish();
			Animal monkey = new Monkey(4, 8);
			Monkey monk = (Monkey) monkey;
			Fish fish = new Fish(3, 6);
			fish.getAge();
			fish.die();
			monkey.getAge();
			System.out.println(fish.getFins());
			
			
			
			
//			Fish fishy = (Fish) ani;
//			ArrayList<Animal> list = new ArrayList<Animal> ();
//			System.out.println(fish);
//			list.add(ani);
//			list.add(monkey);
//			fish.die();
//			fish.noise();
//			for(String items: list) {
//				System.out.println(items);
//			}
			
		}
}
