package com.arrays;

public class SquareRootOfANumber {
	public static int squareRootOfANumber(int n) {
		if(n==0 || n ==1) {
			return n;
		}
		int l = 2, h = n/2, mid = 0;
		int res = 0;
		while(l<=h) {
			mid = (l+h)/2;
			if(mid*mid == n) {
				return mid;
			}else if(mid*mid < n) {
				l = mid + 1;
				res = mid;
			}else {
				h  = mid -1;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int n = 220;
		System.out.println(squareRootOfANumber(n));
		
	}

}
