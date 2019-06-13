package com.kedari.euler;
import java.util.*;


/* 
 * Solution to Project Euler problem 3
 * Copyright (c) Project Kedari. All rights reserved.
 * 
 * 
 */

/* Problem 3: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ? 
 */

/* Answer: 6857 */ 

public class Prg003 {
	public void primeFactor(long number){
		ArrayList list = new ArrayList();
		int res =0;
		for(int i=2;i<=number; i++){
			
			while(number%i==0){
			//res =i;
				list.add(i);
			number = number/i;
			
			
			
		}
			
		}
		
		/*Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		System.out.println(list.get(list.size()-1));
		//System.out.print(res);
		
	}
	public static void main(String[] args){
		long number =600851475143L;
		new Prg003().primeFactor(number);
		
	}
}
