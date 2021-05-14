package algorithms;

import java.util.Arrays;

public class CustomInsertionSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {2,8,5,2,5,0,3,2,9,4,6};
		
		System.out.println(Arrays.toString(array));
		InsertionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void InsertionSort(Integer[] arr) {
		for(int i = 1; i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}

}
