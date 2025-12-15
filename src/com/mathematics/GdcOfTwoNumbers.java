package com.mathematics;

import java.util.Scanner;

public class GdcOfTwoNumbers {
	
	static int gcdOfTwoNumbers(int a, int b) {
		int min = 0;
		if(a<b) {
		    min = a;
		}else {
			min = b;
		}
		for(int i=min;i>0;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	}
	
	
	static int EuclidsApproach(int a, int b) {
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}else {
				b = b-a;
			}
		}
		return a;
	}
	
	static int optimisedEuclidsApproach(int a, int b) {
		
		while(a!=0 && b!=0) {
			if(a>b) {
				a= a%b;
			}else {
				b = b%a;
			}
		}
		if(a!=0) {
			return a;
		}else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		//System.out.println(gcdOfTwoNumbers(a,b));
		//System.out.println(EuclidsApproach(a,b));
		System.out.println(optimisedEuclidsApproach(a, b));
	}

}
