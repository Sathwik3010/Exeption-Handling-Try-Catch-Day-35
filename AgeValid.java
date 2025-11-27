package com.codegnan.exceptions;

import java.util.Scanner;

public class AgeValid {

	public static String setAge(int age) {
		if(age<0 || age > 150)
			throw new IllegalArgumentException();
		
		return "Age Set";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			System.out.println(setAge(age));
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
		}
		sc.close();
	}

}
