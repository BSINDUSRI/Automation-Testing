package com.sorting;

public class bubblesort {
	void bubbleSort(int[] arr) {
		int temp;
		boolean Swapped;
		while(true) {
			Swapped=false;
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]>arr[i]) {
					temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
					Swapped=true;
				}
			}
			if(Swapped==false) {
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,20,10,50,40};
		bubblesort b1=new bubblesort();
		b1.bubbleSort(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}

	}

}
