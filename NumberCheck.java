package com.wipro.logical;

import java.util.Scanner;

public class NumberCheck
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num>0)
		{
		  System.out.println("positive number");	
		}
		else if (num==0)
		{
			System.out.println("Zero");
		}
		else
			System.out.println("negative number");
			sc.close();
	}
	
}
