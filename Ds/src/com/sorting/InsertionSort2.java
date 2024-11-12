package com.sorting;

import java.util.Scanner;

public class InsertionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class for taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n array");
		//n defines size of array
		int n=sc.nextInt();
		//array created
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//selection sort
		for(int i=1;i<a.length;i++) {
			int current=a[i];
			int j=i-1;
			while(j>=0 && current<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			//place
			a[j+1]=current;
			
		}
		//print array in ascending order
		for(int s:a) {
			System.out.println(s);
		}
		System.out.println("---------------------------------------");
		//print array in descending order
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
