package algorithms;

import java.util.Arrays;

public class CustomQuickSort {
	public static void main(String[] args) {
		Integer[] array = new Integer[] {1, 7, 8, 9, 1, 5};
		
		System.out.println(Arrays.toString(array));
		QuickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void QuickSort(Integer[] arr, int low, int high) {
		if(low<high) {
			int pivot = Partition(arr, low, high);
			QuickSort(arr, low, pivot-1);
			QuickSort(arr, pivot+1, high);
		}
	}
	
	private static int Partition(Integer[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i<j) {
			while(arr[i]<=pivot && i<j) 
				i++;
			while(arr[j]>pivot) 
				j--;
			if(i<j)	
				Swap(arr, i, j);
		}
		Swap(arr,j,low);
		return j;

		
		/*
		int pivot = arr[high];
	    int i = (low - 1);
	    for(int j = low; j <= high - 1; j++) {
	        if (arr[j] < pivot) {
	            i++;
	            Swap(arr, i, j);
	        }
	    }
	    Swap(arr, i + 1, high);
	    return (i + 1);
	    */
	}
	
	private static void Swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

}
