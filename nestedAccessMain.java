package com.codegnan.exceptions;

import java.util.Scanner;

public class nestedAccessMain {

	public static int nestedAccess(String str, int index) {
		boolean processed = false;
		int result = -1;
		
		try {
			try {
				if("null".equals(str))
					str = null;
				int len = str.length();
				
				if(index !=0)
					throw new Exception("Invalid index");
				result = len;
			}finally {
				processed = true;
				System.out.println(processed);
			}
		} catch(Exception e) {
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = Integer.parseInt(sc.nextLine());
		
		int output = nestedAccess(str, index);
		System.out.println(output);
		sc.close();
	}

}
