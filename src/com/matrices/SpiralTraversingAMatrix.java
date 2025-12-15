package com.matrices;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversingAMatrix {
	
	static List<Integer> spiralMatrix(int[][] arr){
		int left = 0, right = arr[0].length-1;
		int top = 0, bottom = arr.length-1;
		List<Integer> res = new ArrayList<>();
		
		while(left<=right && top<=bottom) {
			
			for(int i=left;i<=right;i++) {
				res.add(arr[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				res.add(arr[i][right]);
			}
			right--;
			
			if(!(left<=right && top<=bottom)) {
				break;
			}
			for(int i=right;i>=left;i--) {
				res.add(arr[bottom][i]);
			}
			bottom--;
			for(int i=bottom;i>=top;i--) {
				res.add(arr[i][left]);
			}
			left++;
			
		}
		return res;
		
	}

	static int[][] spiralMatrixII(int n){
		int[][] arr = new int[n][n];
		for(int i=1;i<=n;i++) {
			arr[0][0] = i;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16},{17,18,19,20,21,22,23,24},
				{25,26,27,28,29,30,31,32},{33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48}};
		int n = 3;
		
		List<Integer> spiralArray = spiralMatrix(arr);
		System.out.println(spiralArray);

	}

}
