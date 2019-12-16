package com.bridgeLabz.functionalProgram;
import java.util.Scanner;

import com.bridgeLabz.basicProgram.inputClass;

public class Array2d
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
	
	System.out.println("enter a dataType which you want to insert into array");
	inputClass.inputName();
	String dataType=inputClass.name;
	if(dataType.equals("int"))
	 {
		Array2d.inArray();
	 }
	else if(dataType.equals("double"))
	{
				Array2d.douArray();
	}
	else if(dataType.equals("boolean"))
		{
		Array2d.booArray();
		}
	else
	{
		System.out.println("Data is not valid data type! please enter valid dataType");
	}
}
private static void booArray() {
		
		System.out.println("Please enter number of rows");
		int row = sc.nextInt();
		System.out.println("Please enter number of colmns");
		int colm =  sc.nextInt();

		boolean[][] array = new boolean[row][colm];
		System.out.println("please enter the elements ");
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<colm;j++)
			{
				array[i][j] = sc.nextBoolean();
			}
		}
		Array2d.showBooleanArray(array);		
	}
private static void showBooleanArray(boolean[][] array) {
		int row = array.length;
		int coul = array[0].length;
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<coul;j++)
			{
				if(j<coul -1)
				{
					System.out.print(array[i][j] + " , ");
				}
				else
				{
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}	
	}
	private static void douArray() {
		System.out.println("Please enter number of rows");
		int row = sc.nextInt();
		System.out.println("Please enter number of colmns");
		int colm =  sc.nextInt();

		double[][] array = new double[row][colm];
		System.out.println("please enter the elements ");
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<colm;j++)
			{
				array[i][j] = sc.nextDouble();
			}
		}
		Array2d.showDoubleArray(array);	
	}
	private static void showDoubleArray(double[][] array) {
		int row = array.length;
		int coul = array[0].length;
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<coul;j++)
			{
				if(j<coul -1)
				{
					System.out.print(array[i][j] + " , ");
				}
				else
				{
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
	}
	private static void inArray() {
		
		System.out.println("Please enter number of rows");
		int row = sc.nextInt();
		System.out.println("Please enter number of colmns");
		int colm =  sc.nextInt();
		
		int[][] array = new int[row][colm];
		System.out.println("please enter the elements ");
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<colm;j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		Array2d.showIntArray(array);
}
	private static void showIntArray(int[][] array) {
		int row = array.length;
		int coul = array[0].length;
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<coul;j++)
			{
				if(j<coul -1)
				{
					System.out.print(array[i][j] + " , ");
				}
				else
				{
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
		
	}
}