package algorithms;

import java.util.Arrays;

public class BinarySearchRecursive {
	public static void main(String[] args) {
		Integer[] array = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		int key = 11;
		System.out.println(Arrays.toString(array));
		System.out.println("Key is at: "+BinarySearch(array,key,0,array.length-1));
	}
	
	// Time complexity=> worst: O(log n), best: O(1)
	public static int BinarySearch(Integer[] arr, int key, int low, int high) {
		if(low>high) 
			return -1;
		int mid = (low + high)/2; 
		if(arr[mid]==key)
			return mid;
		if(arr[mid]>key)
			return BinarySearch(arr, key, low, mid-1);
		else
			return BinarySearch(arr, key, mid+1, high);
	}
}
