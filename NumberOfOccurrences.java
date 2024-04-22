package com.stringmethods;
import java.util.Scanner;
public class NumberOfOccurrences {
	public static void main(String []args)
	{
		int count=0; 
		String str="Java is a Programming Language";
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("No of occurance of "+ch+" : "+count);
	}

}
