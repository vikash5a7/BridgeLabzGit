package com.bridgeLabz.basicProgram;

import java.util.Scanner;

public class inputClass {
	public static String name; 
	public static int number;
	public static int count=0;
	static Scanner scanner=new Scanner(System.in);
	public static void inputName()
	{
		 name = scanner.nextLine();
	}
	public static void inputNumber()
	{
		number = scanner.nextInt();
		
	}
	public static	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
