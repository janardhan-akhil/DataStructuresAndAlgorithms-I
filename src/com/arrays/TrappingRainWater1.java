package com.arrays;

public class TrappingRainWater1 {
	
	public static int trappintWater1(int[] arr) {
		if(arr.length == 1 || arr.length == 2) {
			return -1;
		}
		int res = 0;
		for(int i=1;i<=arr.length-2;i++) {
			int ld = arr[i];
			for(int j=0;j<=i;j++) {
				if(arr[j]>ld) {
					ld = arr[j];
				}
			}
			int rd = arr[i];
			for(int j =i+1;j<arr.length;j++) {
				if(arr[j]>rd) {
					rd = arr[j];
				}
			}
			int waterLevel = Math.min(ld, rd);
			int tr = waterLevel - arr[i];
			res = res+tr;
		}
		return res;
	}
	public static int trappintWater2(int[] arr) {
		int lhb = arr[0], rhb = arr[arr.length-1], res = 0;
		int i=0, j=arr.length-1;
		while(i<=j) {
			if (lhb<=rhb) {
				if(arr[i]>=lhb) {
					lhb = arr[i];
				}else {
					res = res + lhb - arr[i];
				}
				i++;
			} else {
				if(arr[j]>=rhb) {
					rhb = arr[j];
				}else {
					res = res+rhb-arr[j];
				}
				j--;
			}
			
			
		}
		return res;
	}

	 
	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trappintWater2(arr));

	}

}
