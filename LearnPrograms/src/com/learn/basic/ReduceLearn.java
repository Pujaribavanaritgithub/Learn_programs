package com.learn.basic;

import java.util.Arrays;
import java.util.List;

public class ReduceLearn {

	public static void main(String[] args) {
		 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		Integer reduce = numbers.stream().reduce(0, (a,b) -> a+b);
		
		Integer reduce1 = numbers.stream().reduce(1, (a,b) -> a*b);
		
		System.out.println(reduce);
		
		System.out.println(reduce1);
		
	}

}
