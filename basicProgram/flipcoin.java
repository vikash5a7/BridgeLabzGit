package com.bridgeLabz.basicProgram;

import java.util.Scanner;

public class flipcoin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many times do you want to print ?");
		int numberOfTime = sc.nextInt();
		int counter = 1;
		double heads = 0;
		double tails = 0;
		double randNum = 0.0;
		double percentageOfTail;
		double percentageOfhead;

		while(counter<=numberOfTime)
		{
			randNum = Math.random();
//            System.out.print(counter + "\t" + randNum);
             
            if(randNum < 0.5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
               }
            counter++;      
			
		}
		 System.out.println();
	     System.out.println("Number of Heads = " + heads);
	     percentageOfhead = (heads/numberOfTime)*100;
	     System.out.println("Percentage of Heads = " + percentageOfhead + "%");
	     System.out.println("Number of Tails = " + tails);
	     percentageOfTail = (tails/numberOfTime)*100;
	     System.out.println("Percentage of Heads = " + percentageOfTail + "%");
		
	}

}

