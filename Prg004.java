package com.kedari.euler;


/* 
 * Solution to Project Euler problem 4
 * Copyright (c) Project Kedari. All rights reserved.
 * 
 * 
 */

/* Problem 4: A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers. 
 */

/* Answer: 906609 */


public class Prg004 {
	
	public int reverse(int n){
		int rev =0;
		while(n>0){
		rev = rev*10 + n%10;
		n = n/10;
		}
		//System.out.println(rev);
		return rev;
		
	
	}
	
	public static void main(String[] args){
		int large =0;
		int number =0;
		int output =0;
		//System.out.println(new Prg004().reverse(289));
		for(int i = 991; i< 999; i++){
			for(int j= 911; j<999;j++){
				number = i*j ;
				large = new Prg004().reverse(number);
				if((large == number) && (large > output)){
					output = number  ;
					System.out.println(i + " "+j);
				}
			}
		}
		
		System.out.println(output);
	
	}
}
