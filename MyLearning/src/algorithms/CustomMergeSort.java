package algorithms;

import java.util.Arrays;

public class CustomMergeSort {
	public static void main(String[] args) {
		Integer[] array = new Integer[] {10, 7, 0, 9, 1, 5};
		
		System.out.println(Arrays.toString(array));
		MergeSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	// Time complexity : O(n log n) both worst and best
	public static void MergeSort(Integer[] arr, int lb, int ub) {
		if(lb<ub) {
			int mid = (lb + ub)/2;
			MergeSort(arr, lb, mid);
			MergeSort(arr, mid+1, ub);
			Merge(arr,lb,mid,ub);
		}
	}
	private static void Merge(Integer[] arr, int lb, int mid, int ub) {
		Integer[] temp = new Integer[arr.length];
		int i = lb;
		int j = mid+1;
		int k = lb;
		while(i<=mid && j<=ub) {
			if(arr[i]<=arr[j]) {
				temp[k] = arr[i];
				i++;
			}else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		while(j<=ub) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		for(int t=lb;t<=ub;t++) {
			arr[t]=temp[t];
		}
	}
}
