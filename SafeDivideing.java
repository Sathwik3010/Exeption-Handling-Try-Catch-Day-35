package com.codegnan.exceptions;

import java.util.Scanner;

public class SafeDivideing {

	public static int safeDivide(int a, int b) {
		try {
			return a/b;
		} catch(ArithmeticException e) {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(safeDivide(a,b));
		sc.close();
	}

}
