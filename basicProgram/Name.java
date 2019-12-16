package com.bridgeLabz.basicProgram;

public class Name {
	public static void main(String[] args) {
		System.out.println("Please enter name which you want to replaced:");
		inputClass.inputName();
		String s1 = "Hello ";
		String name = " Sohan ";
		String s2 = " ,How are you?";
		String s3 = s1  + name + s2 ;
		System.out.println("present name :  " + s3);
		if(inputClass.name.length() > 2)
		{
			s3 = s1 + inputClass.name + s2;
		}
		
		System.out.println("Name after replaced: " + s3);
	}

}
