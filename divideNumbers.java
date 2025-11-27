package com.codegnan.exceptions;

import java.util.Scanner;

public class divideNumbers {

	public static int  divideNumbers(int a, int b) {
		try {
			return a/b;
		} finally {
			System.out.println("Log: Division attempted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int result = divideNumbers(a,b);
			System.out.println(result);
		} catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		} finally {
			sc.close();
		}
	}

}
