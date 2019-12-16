package com.bridgeLabz.basicProgram;

public class power2
{
	
	public static void main(String[] args)
	{
				int num = 0;
				System.out.println("Please enter the power value:");
				try
				{
					num = Integer.parseInt(args[0]);
				}
				catch (NumberFormatException e) {
					e.printStackTrace();
				}
				int power = 1;
				if(num >= 0 && num < 31)
				{
					for(int i = 0; i <= num; i++)
					{
						System.out.println("2 ^" + i + " = " +power);
						power =  (power * 2);
					}
				}
				else
				{
					System.out.println("enter the value between the 1-32");
				}

		}
}


