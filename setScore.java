package com.codegnan.exceptions;

import java.util.Scanner;

public class setScore {

	public static String setScore(int score) {
		if(score < 0 || score >100)
			throw new IllegalArgumentException();
		return "Score set";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		try {
			System.out.println(setScore(score));
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
		} finally {
			sc.close();	
		}
	}

}
