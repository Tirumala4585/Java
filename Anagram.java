package com.stringmethods;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String []args)
	{
		  Scanner sc = new Scanner(System.in);  
		  System.out.println("Enter the  first string :"); 
		  String str1 = sc.nextLine();
		  System.out.println("Enter the second string");
		  String str2 = sc.nextLine();
		  boolean flag=true;
		  if(!str1.isEmpty() && !str2.isEmpty())
		  {	  
		      int len1 = str1.length();
		      int len2 = str2.length();
			  if(len1==len2)
			  {
			  str1=str1.toLowerCase();
			  str2=str2.toLowerCase();
			  char[] ch1 = str1.toCharArray();
			  char[] ch2 = str2.toCharArray();
			  Arrays.sort(ch1);
			  Arrays.sort(ch2);
			  for(int i=0;i<len2;i++)
			  {
				 if(ch1[i]!=ch2[i]) 
				 { 		  
				   flag=false;
				   break;
				 }
			  }
			  if(flag)
			  {
				  System.out.println("Given strings are Anagram");
			  }
			  else
			  {
				  System.out.println("Given strings are not a Anagram");
			  }
	          }
			  else
			  {
				  System.out.println("Given strings ae not a Anagram");
			  }
		  }
		  else
		  {
			  System.out.println( "Please enter the string");
		  }
	}

}
