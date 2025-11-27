package com.codegnan.exceptions;

import java.util.Scanner;

public class LengthofString {

	public static int getLength(String str) {
		try {
			return str.length();
		} catch(NullPointerException e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		if(input.equals("null")) {
			input = null;
		} else {
			input  = input.replace(" ", "");
		}
		
		try {
			int length = getLength(input);
			System.out.println(length);
		} catch(NullPointerException e){
			System.out.println("NullPointerException");
		} finally {
			sc.close();
		}
	}

}
