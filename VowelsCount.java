package com.stringprograms;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String []args)
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the string");
	      String str1 = sc.nextLine();
	      int count=0; 
	      if(!str1.isEmpty())
	      {
	         String str2=str1.toLowerCase();
	         for(int i=0;i<str2.length();i++)
	         {
	             if(isVowel(str2.charAt(i)))
	             {
	                 count++;
	             }   
	         }
	         System.out.println("No of Vowels in a given string:"+count);
	      }
	      else
	      {
	           System.out.println("Please enter the string");
	      }
	    }
	    public static boolean isVowel(char ch)
	    {
	          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	          {
	              return true;
	          }
	          return false;
	   }
}
