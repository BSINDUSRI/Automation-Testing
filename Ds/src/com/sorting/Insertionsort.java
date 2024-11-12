package com.sorting;

import java.util.Scanner;

public class Insertionsort {
	public static void printArray(int[] value) {
		int n=value.length;
		for(int i=0;i<=n;i++) {
			System.out.println(value[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter the array");
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		int[] arr= {10,20,50,70,30};
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			//place
			arr[j+1]=current;
			
		}
        printArray(arr);
	}

}
