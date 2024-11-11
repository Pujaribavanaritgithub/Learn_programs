package com.learn.basic;


import java.util.Arrays;
import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(123,95,48,64,35,29,31);
		
		numbers.stream()
		       .filter(i -> i%2 ==0)
		       .forEach(i -> System.out.println(i));

	}

}
