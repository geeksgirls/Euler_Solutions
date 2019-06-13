package com.kedari.euler;

/* 
 * Solution to Project Euler problem 5
 * Copyright (c) Project Kedari. All rights reserved.
 * 
 * 
 */

/* Problem 5: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder. 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/* Answer: 232792560 
 
 */


public class Prg005 {
	
	public void multiple(int num){
	
		int output=0;
		do{
			
			for(int i=1; i<=20;i++){
				
				if(num%i==0){
					output++;
				
				}
				
			}
			if(output == 20){
				System.out.println(num);
				
			}
			else{
				num = num+20;
				output =0;
			}
		
		
		}while(output == 0);
	
	}
	
	public static void main(String[] args){
		int n =20;
		new Prg005().multiple(n);
	}

}
