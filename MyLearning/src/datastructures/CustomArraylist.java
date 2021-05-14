package datastructures;

import java.util.Arrays;

public class CustomArraylist<T> {
	private Integer size;
	private Object arr[];
	private Integer count = 0;
	
	public CustomArraylist(Integer i) {
		size=i;
		arr=new Object[size];
	}
	public CustomArraylist() {
		size=5;
		arr=new Object[size];
	}
			
	public Object add(T i){
		if(count==size){
			arr = Arrays.copyOf(arr, size + (size/2));
			size = size + (size/2);
		}
		arr[count]=i; 
		count++;
		return arr;
	}
	
	public Object pop(){
		Object temp = arr[0];
		for(int j=0; j<count;j++){
			arr[j]=arr[j+1];
		}
		count--;
		return temp;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
}
