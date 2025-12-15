package com.mathematics;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		int res =1;
		for(int i=1;i<=n;i++) {
			res =res*i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
		

	}

}
