package com.mathematics;

import java.util.Scanner;

public class LeastCommonMultiple {

	static int findLcm(int a, int b) {
		int res = Math.max(a, b);
		while (true) {
			if (res % a == 0 && res % b == 0) {
				break;
			}
			res++;
		}
		return res;
	}

	static int optimisedEuclidsApproach(int a, int b) {

		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}
	}

	static int optimisationToFindLcm(int a, int b) {
		return a * b / optimisedEuclidsApproach(a, b);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		//System.out.println(findLcm(a, b));
		System.out.println(optimisationToFindLcm(a,b));

	}

}
