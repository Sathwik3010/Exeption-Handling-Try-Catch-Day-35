package com.codegnan.exceptions;

import java.util.Scanner;

public class Division {

	public static int divide(int a, int b) {
		try {
			return a/b;
		} catch(ArithmeticException e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int result = divide(a,b);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		sc.close();
	}

}
