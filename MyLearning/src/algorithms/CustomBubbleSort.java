package algorithms;

import java.util.Arrays;

public class CustomBubbleSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {2,8,5,2,5,0,3,2,1,4,6};
		
		System.out.println(Arrays.toString(array));
		BubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void BubbleSort(Integer[] arr) {
		//int iterations = 0;
		for(int i = 0; i<arr.length-1; i++) {
			Boolean swapped = Boolean.FALSE;
			//iterations++;
			for(int j = 0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swapped = Boolean.TRUE;
					int temp = arr[j];
				    arr[j] = arr[j+1];
				    arr[j+1] = temp;
				}
			}
			if(!swapped) break;
		}
		//System.out.println("Iterations done: "+iterations);
	}

}
