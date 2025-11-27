package com.codegnan.exceptions;

import java.util.Scanner;

public class nestedStringArray {

	public static int nestedStringArray(String str, int index) {
		try {
			try {
				int length = str.length();
				int[] arr = {length};
				return arr[index];
			} catch(Exception e) {
				return  -1;
			}
		} catch(Exception e) {
			return  -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		int index = Integer.parseInt(sc.nextLine().trim());
		
		if(input.equalsIgnoreCase("null"))
			input = null;
		
		int result = nestedStringArray(input, index);
		System.out.println(result);
		sc.close();
	}

}
