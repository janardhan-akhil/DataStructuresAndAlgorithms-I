package com.mathematics;

import java.util.Scanner;

public class PrimeNumbers {

	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean checkPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean efficientCheckPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	static void printPrime(int n) {
		for(int i=2;i<=n;i++) {
			if(efficientCheckPrime(i)) {
				System.out.println(i);
			}
		}
	
	}
	static void sievePrintPrime(int n) {
		boolean[] prime = new boolean[n+1];
	   for(int i=2; i*i<=n; i++) {
		   if(prime[i] == false) {
			   for(int j = i*i; j<=n; j=j+i) {
				   prime[j] = true;
			   }
		   }
	   }
	   for(int i=2; i<=n; i++) {
		   if(prime[i]==false) {
			   
			   System.out.println(i);
		   }
	   }
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		// System.out.println(isPrime(a));
		// System.out.println(checkPrime(a));
		//System.out.println(efficientCheckPrime(a));
		//printPrime(a);
		sievePrintPrime(a);

	}

}
