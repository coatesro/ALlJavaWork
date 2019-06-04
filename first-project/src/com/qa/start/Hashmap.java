package com.qa.start;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[]args) {
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		String s = "Nurse Julie";
		String f = "Nurse Joe";
		String g = "Nurse Laura";
		
		myMap.put(6, s);
		myMap.put(4, f);
		myMap.put(3, g);
		System.out.println(myMap.get(3));
;	}
}
