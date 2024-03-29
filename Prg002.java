package com.kedari.euler;

/* 
 * Solution to Project Euler problem 2
 * Copyright (c) Project Kedari. All rights reserved.
 * 
 * 
 */

/* Problem 2: Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms. 
 */

/* Answer :4613732 */

public class Prg002 {
	

public  int fibonacci(int num) {
		int z =0;
		int sum =0;
		int x =0;
		int y =1;
	while(z<num){
			
			z = x+y;
			
			x=y;
			y=z;
			
			if(z%2 == 0){
				sum+=z;
			}
			
			
			
		}
	return sum;
}
		
		public static void main(String[] args){
			Prg002 obj = new Prg002();
			int output = obj.fibonacci(4000000);
			System.out.println(output);
		}
}
