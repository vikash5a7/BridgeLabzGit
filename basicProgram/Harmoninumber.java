package com.bridgeLabz.basicProgram;

public class Harmoninumber 

{

		public static void main(String[] args) 
		{
			System.out.println("Please enter the Nth harmonic value:");
			inputClass.inputNumber();
			
			final float a = 1;
			double harmonic  = 0;
			
			for(int i = 1; i <= inputClass.number; i++)
			{
				harmonic = harmonic +  a / i;
			}
			System.out.println(inputClass.number + " Harmonic value:"  + harmonic);
		}
}
