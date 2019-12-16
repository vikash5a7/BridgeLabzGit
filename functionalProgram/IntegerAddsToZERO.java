package com.bridgeLabz.functionalProgram;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeLabz.basicProgram.inputClass;



public class IntegerAddsToZERO 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(" Enter the number of elements you want to store in it? ");
		inputClass.inputNumber();
		int num = inputClass.number;
		int a[]=new int[num];
		System.out.println("enter elements you want to store it ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int count = 0;
		for (int i = 0; i < a.length-2; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				for (int k = j+1; k < a.length; k++) {
					if((a[i]+a[j]+a[k])==0)
					{
					count++;	
					System.out.print(a[i]);
					System.out.print(", ");
					System.out.print(a[j]);
					System.out.print(", ");
					System.out.print(a[k]);
					System.out.println();
					
					}
				}
			}
		}
		System.out.println(" Count " +count);
		
	}

}
