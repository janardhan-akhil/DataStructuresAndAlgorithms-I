package com.matrices;

import java.util.Arrays;

public class MatrixMedianPosition {
	public static int findMedian(int[][] arr) {
		int[] res = new int[3*5];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				res[k++] = arr[i][j];
			}
		}
		
		Arrays.sort(res);
		int median = res.length/2;
		return median;
	}
	
	public static int findMedian2(int[][] arr) {
		int l = arr[0][0];
		int h = arr[0][0];
		int mid = 0;
		int medianPos = (arr.length * arr[0].length+1)/2;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]<l) {
				l = arr[i][0];
			}
			if(arr[i][arr[0].length-1] > h) {
				h = arr[i][arr[0].length-1];
			}
		}
		
		while(l<h) {
			 mid = (l+h)/2;
			int count = 0;
			for(int i=0;i<arr.length;i++) {
				int x = countSmallerEqual(arr[i],mid);
				count = count+x;
			}
			if(count<medianPos) {
				l = mid+1;
			}else {
				h = mid;
			}
		}
		return l;
	}
	
	public static int binarySearch(int[] arr,int target) {
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		
		while(low<=high) {
			mid = (low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low = mid+1;
			}else {
				high = mid;
			}
		}
		return low;
	}
	
	public static int countSmallerEqual(int[] arr, int target) {
	    int low = 0, high = arr.length;
	    while (low < high) {
	        int mid = (low + high) / 2;
	        if (arr[mid] <= target) {
	            low = mid + 1;
	        } else {
	            high = mid;
	        }
	    }
	    return low;
	}

	public static void main(String[] args) {
		int[][] arr = {{5,11,20,35,45},{1,2,3,4,6},{13,15,16,19,21}};
		//System.out.println(findMedian(arr));
		System.out.println(findMedian2(arr));
	}

}
