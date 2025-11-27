package com.codegnan.exceptions;

import java.util.Scanner;

public class complexOperation {

	public static int complexOperation(String str, int index) {
		int result = -1;
		
		try {
			int number = Integer.parseInt(str);
			
			int[] arr = {number};
			
			if(index < 0 || index >= arr.length) {
				throw new ArrayIndexOutOfBoundsException("Invalid index");
			}
			result = arr[index];
		} catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
			result = -1;
		}
		return index;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = Integer.parseInt(sc.nextLine());
		System.out.println(complexOperation(str, index));
		sc.close();
	}

}
