package com.sorting;

import java.util.Scanner;

public class Selectionsort2 {
	public static void printArray(int[] v) {
		for(int i=0;i<v.length;i++) {
			System.out.println(v[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
					
					
				}
				
			}
			int temp= arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		printArray(arr);
		System.out.println("----------------------------------");
		for(int i=4;i<=arr.length;i--) {
			System.out.println(arr[i]);
			
		}

	}

}
