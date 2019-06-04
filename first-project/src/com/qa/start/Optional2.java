package com.qa.start;
import java.util.Optional;

public class Optional2 {
	public static void main(String[]args) {
		
		String x = null;
		
		Optional<String> myOptional = Optional.ofNullable(x);
		System.out.println(myOptional.orElse("oh no"));
	}
}
