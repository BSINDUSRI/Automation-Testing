package com.sorting;

public class selectionsort {
	public static void printArray(int[] value) {
		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,50,70,30};
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
					
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		printArray(arr);

	}

}
