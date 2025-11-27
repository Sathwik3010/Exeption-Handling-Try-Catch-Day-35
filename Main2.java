package com.codegnan.exceptions;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("in try block");
			int result=10/0;
			System.out.println("this won't print");
		} catch(NullPointerException e){
			System.out.println("in catch block: "+e.getMessage()); // we can call 
		} finally {
			System.out.println("in finally block cleanup activities");
		}
		System.out.println("Program continues normally");
	}

}
