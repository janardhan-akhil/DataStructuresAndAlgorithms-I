package com.arrays;

import java.util.PriorityQueue;

public class FindKthLargestElement {
	public static int kthLargestElement(int[] nums, int k) {
		// Arrays.sort(arr);
		// return arr[arr.length-k];
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int num : nums) {
			minHeap.add(num);
			if (minHeap.size() > k) {
				minHeap.poll(); // remove smallest
			}
		}

		return minHeap.peek();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 3, 4, 5, 5, 6 };
		int k = 4;
		System.out.println(kthLargestElement(arr, k));

	}

}
