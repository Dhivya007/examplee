package com.wipro.logical;

import java.util.Scanner;

public class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("e")||ch.equalsIgnoreCase("i")||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("u"))
		{
			System.out.println("vowel character");
		}
		else
			System.out.println("consonent character");
		sc.close();
	}

}
