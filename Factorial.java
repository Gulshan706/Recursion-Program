package com.gulshan.factorial;

public class Factorial {

	public int factorialCalculation(int num) {
		
		//Using while loop
		/*
		 int fact = 1;
		while (num != 0)
			fact *= num--;
		return fact;
		*/
		
		//Using recursion 
		if(num>=1) {
		
			
			return num* factorialCalculation(num-1);
			
		}
		return 1;
		
	}
}
