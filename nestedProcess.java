package com.codegnan.exceptions;

import java.util.Scanner;

public class nestedProcess {

	public static int nestedProcess(String str, int index) {
		try {
			try {
				int number = Integer.parseInt(str);
				int[] arr = {number};
				return arr[index];
			} catch(Exception e) {
				return -1;
			}
		} catch(Exception e) {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		int index = Integer.parseInt(sc.nextLine().trim());
		
		int result = nestedProcess(str, index);
		System.out.println(result);
		sc.close();
	}

}
