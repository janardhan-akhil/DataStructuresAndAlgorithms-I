package com.matrices;

public class TwoDMatrix {
	public static boolean serachInMatrix(int[][] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean searchInMatrix2(int[][] arr, int target) {
		int i=0, j=arr[0].length-1;
		while(i<arr.length && j>=0) {
			if(arr[i][j]==target) {
				return true;
			}else if(target<arr[i][j]) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}

	public static boolean searchMatrix(int[][] arr, int target) {
		int m = arr.length;
		int n = arr[0].length-1;
		int l=0, h= m*n;
		while(l<=h) {
			int mid = (l+h)/2;
			int row = mid/n;
			int col = mid%n;
			
			if(arr[row][col] == target) {
				return true;
			}else if(target < arr[row][col]) {
				h = mid -1;
			}else {
				l = mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,19,22},{10,13,14,17,24}};
		int target = 16;
		//System.out.println(serachInMatrix(arr, target));
		//System.out.println(searchInMatrix2(arr, target));
		System.out.println(searchMatrix(arr, target));

	}

}
