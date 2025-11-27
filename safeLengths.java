package com.codegnan.exceptions;

import java.util.Scanner;

public class safeLengths {

	public static int safeLength(String str) {
		try {
			return str.length();
		} catch(NullPointerException e) {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String str = input.equals("null")? null : input;
		
		System.out.println(safeLength(str));
		sc.close();
	}

}
