package algorithms;

import java.util.Arrays;

public class BinarySearchIterative {
	public static void main(String[] args) {
		Integer[] array = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		int key = 4;
		System.out.println(Arrays.toString(array));
		System.out.println("Key is at: "+BinarySearch(array,key));
	}
	
	// Time complexity=> worst: O(log n), best: O(1)
	public static int BinarySearch(Integer[] arr, int key) {
		int lower = 0;
		int upper = arr.length - 1;
		while(lower<=upper) {
			int mid = (lower+upper)/2;
			if(arr[mid]==key)
				return mid;
			else if(key>arr[mid])
				lower = mid+1;
			else 
				upper = mid-1;
		}
		return -1;
	}
}
