package com.gulshan.fibbonacci;

public class Fibbonacci {

	// Printing number in Fibonacci series

	public int fibbonacci(int num) {
		if (num == 0) {
			return 0;
		}
		// Base cases return itself 0 and 1
		else if (num == 1) {
			return 1;
		} else {
			// Recursive calls
			return fibbonacci(num - 1) + fibbonacci(num - 2);

		}
	}
}
