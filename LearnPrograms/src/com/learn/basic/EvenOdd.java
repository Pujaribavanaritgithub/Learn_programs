package com.learn.basic;


import java.util.Arrays;
import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,9,4,6,3,27);
		
		numbers.stream()
		       .filter(i -> i%2 ==0)
		       .forEach(i -> System.out.println(i));

	}

}
