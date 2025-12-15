package com.mathematics;

import java.util.Scanner;

public class TrailingZeros {
	
	static int trailingZeros(int n) {
		int res = 0;
		int powerOf5 = 5;
		while(n>=powerOf5) {
			res = res + (n/powerOf5);
			powerOf5*=5;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(trailingZeros(n));
		

	}

}
