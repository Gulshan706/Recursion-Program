package com.gulshan.factorial;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Factorial fact=new Factorial();
		System.out.println("Inter the number which you want to find factorial value");
		Scanner scr=new Scanner(System.in);
		
		int num=scr.nextInt();
		System.out.println("You have intered "+num+" to find the factorial of the number");
	
         
		System.out.println("Result is : " +fact.factorialCalculation(num));
         
	}

}
