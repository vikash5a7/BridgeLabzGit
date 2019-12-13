package com.bridgeLabz.algorithm;

import com.bridgeLabz.basicProgram.inputClass;

public class permutation {// Java program to print all permutations of a 
	
		public static void main(String[] args) 
		{ 
		System.out.println("Please enter a String: ");
		inputClass.inputName();
		String str=inputClass.name;
		int n = str.length();
		permute(str, 0, n-1); 
		} 

		/** 
		* permutation function 
		* @param str string to calculate permutation for 
		* @param l starting index 
		* @param r end index 
		*/
		private static void permute(String str, int l, int r) 
		{ 
			if (l == r) 
				System.out.println(str); 
			else
			{ 
				for (int i = l; i <= r; i++) 
				{ 
					str = swap(str,l,i); 
					permute(str, l+1, r); 
					str = swap(str,l,i); 
				} 
			} 
		} 

		/** 
		* Swap Characters at position 
		* @param a string value 
		* @param i position 1 
		* @param j position 2 
		* @return swapped string 
		*/
		public static String swap(String a, int i, int j) 
		{ 
			char temp; 
			char[] charArray = a.toCharArray(); 
			temp = charArray[i] ; 
			charArray[i] = charArray[j]; 
			charArray[j] = temp; 
			return String.valueOf(charArray); 
		} 

	} 
