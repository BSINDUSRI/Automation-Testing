package com.sorting;

import java.util.Scanner;

public class Handsonbubblesort {
	public static void printArray(int[] value) {
	
		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]+" ");
		}
		System.out.println();
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
	
		int[] arr= new int[5];
		for(int k=0;k<arr.length;k++) {
			arr[k]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArray(arr);

	}

}
