package com.bridgeLabz.algorithm;

import java.util.Scanner;

public class InsertSort {
	
	
	public void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while (j>=0 && arr[j]<=key) {
				arr[j+1] = arr[j];
				j--;			
			}
			arr[j]=key;
			
		}
	}
	public static void main(String args[]) 
	{		 
		int number;
		System.out.println("ente how many do you want to enter elements");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int arr[] = new int[number];
		System.out.println("enter your elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("elements before sorting: ");
		printArray(arr); 
		InsertionSort ob = new InsertionSort();		
		System.out.println("elements after sorting: ");
		ob.sort(arr); 
		printArray(arr); 
	}

	private static void printArray(int[] arr) {
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

}
