package com.codegnan.exceptions;

import java.util.Scanner;

public class checkPositive {

	public static String checkPositive(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		
		return "Valid";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		try {
			System.out.println(checkPositive(num));
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
//			throw e;
		} finally {
			sc.close();
		}
	}

}
