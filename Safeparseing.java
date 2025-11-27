package com.codegnan.exceptions;

import java.util.Scanner;

public class Safeparseing {

	public static int safeParse(String str) {
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException e) {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int result = safeParse(input);
		System.out.println(result);
		sc.close();
	}

}
