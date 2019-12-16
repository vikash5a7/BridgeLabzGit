package com.bridgeLabz.functionalProgram;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of a :");
		double a = sc.nextDouble();
		System.out.println("Please enter the value of b :");
		double b = sc.nextDouble();
		System.out.println("Please enter the value of c :");
		double c = sc.nextDouble();
		
		double delta = b*b - 4*a*c;
		double root1 = (-b + sqrt(delta))/(2 * a);
		double root2 = (-b - sqrt(delta))/(2 * a);
		System.out.println("delat value :" + delta);
		
		System.out.println("Root 1 of x =  " +root1 );
		System.out.println("Root 2 of x =  " +root2 );
		
	}
	public static double sqrt(double delat)
	{
		return delat * delat;
	}

}
