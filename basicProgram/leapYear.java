package com.bridgeLabz.basicProgram;

public class leapYear {
	public static void main(String[] args) {
		System.out.println("Please enter year : ");
		inputClass.inputNumber();
		int year = inputClass.number;
		boolean status = false;
		int count = 0 ;
		int yearCount = year;
		while(yearCount != 0)
		{
			count ++;
			yearCount /= 10;
			
		}
		System.out.println("year length:" + count);
		if(count == 4)
		{
			if(year % 4 == 0)
			{
				if(year % 100 == 0)
				{
					if(year % 400 == 0)
					{
						status = true;
					}
					else
						status = false;
				}
				else
					status = true;
			}
			else
				status = false;
		}
		else
		{
			System.out.println("please enter year of four digit:");
			return;
		}
		
		if(status)
			System.out.println("The given year  " + year +" is leap year :");
		
		else
			System.out.println("The given year  " +year +" is not leap year:");
		
		
	}


}
