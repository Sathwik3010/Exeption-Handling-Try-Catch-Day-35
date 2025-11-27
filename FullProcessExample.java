package com.codegnan.exceptions;

import java.util.Scanner;

public class FullProcessExample {

	public static int fullProcess(String str, int divisor) throws Exception{
		int result = 0;
		try {
			int num = Integer.parseInt(str);
			
			if(divisor == 0)
				throw new ArithmeticException("Cannot divide by zero"); 
			result = num/divisor;
			return result;
		} catch(Exception e) {
			result = 0;
			return result;
		} finally {
            System.out.println("Logged");
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int divisor = Integer.parseInt(sc.nextLine());
		
		int result = fullProcess(str, divisor);
		System.out.println(result);
		sc.close();
	}

}
