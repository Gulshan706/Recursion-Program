package com.gulshan.fibbonacci;

import java.util.Scanner;

public class FibbonacciTest {

	public static void main(String[] args) {
		int num;
		//Creating object
		Fibbonacci fib=new Fibbonacci();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scr.nextInt();
		scr.close();
		System.out.println("Result : "+fib.fibbonacci(num));
	}

}
