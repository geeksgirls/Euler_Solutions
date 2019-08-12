package com.kedari.euler;


/* 
 * Solution to Project Euler problem 6
 * 
 * Copyright (c) Project Kedari. All rights reserved.
 * 
 * 
 */

/* Problem 6: The sum of the squares of the first ten natural numbers is,
 * (1)2 + (2)2 + ..... + (10)2 = 385.
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers 
 * and the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers 
 * and the square of the sum.
 */

/* Answer: 25164150
 
 */

public class Prg006 {
	
	public static void main(String[] args){
		int sumOfSquare=0;
		for(int i=1;i<=100;i++){
			sumOfSquare = sumOfSquare+(i*i);
		}
		
		int sumOfTenNum=0;
		for(int j=1;j<=100;j++){
			sumOfTenNum +=j;
			
		}
		int res = sumOfTenNum*sumOfTenNum;
		
		int answer = res-sumOfSquare;
		System.out.println(answer);
		
		
		
	}
}
