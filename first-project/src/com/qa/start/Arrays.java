package com.qa.start;

public class Arrays {
	public static void main (String[] args) {
		int [] [] x = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}								
		};
		for(int[] row : x) {
			for (int cell: row) {
				System.out.println(cell);
			}
		}
		System.out.println(x[2][1]);
		System.out.println(x);
		}
	}

