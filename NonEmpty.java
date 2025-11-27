package com.codegnan.exceptions;

import java.util.Scanner;

public class NonEmpty {

	public static String checkNonEmpty(String str) {
		if(str == null || str.isEmpty())
			throw new IllegalArgumentException();
		
		return "Non-empty";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.equals("null"))
			input = null;
		
		try {
			System.out.println(checkNonEmpty(input));
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
		}
		sc.close();
	}

}
