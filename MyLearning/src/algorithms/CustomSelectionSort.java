package algorithms;

import java.util.Arrays;

public class CustomSelectionSort {
	public static void main(String[] args) {
		Integer[] array = new Integer[] {2,8,5,2,5,0,3,2,9,4,6};
		
		System.out.println(Arrays.toString(array));
		SelectionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void SelectionSort(Integer[] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			int min = i;
			for(int j = i+1; j < arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				int temp = arr[i];
			    arr[i] = arr[min];
			    arr[min] = temp;
			}
		}
	}

}
