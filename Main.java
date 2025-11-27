package com.codegnan.exceptions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		System.out.println("Hi malli");
		int[] num= {10,20};
		try {
//			System.out.println(10/0);
			System.out.println(num[5]);
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Welcome");
		} 
//			catch(Exception e) {
//			System.out.println("main");
//		}
	}

}
