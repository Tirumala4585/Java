package com.stringprograms;

public class SwapingTwoStrings {
	public static void main(String []args)
	{
		 String str1="JAVA";
		 String str2="C++";
		 System.out.println(str1.length());
		 System.out.println(str2.length());
		 System.out.println("Before Swapping : ");
		 System.out.println("String1:"+str1);
		 System.out.println("String2:"+str2);
		 str1=str1+str2;
		 str2=str1.substring(0,str1.length()-str2.length());
		 System.out.println("After swapping : ");
		 str1=str1.substring(str2.length());
		 System.out.println("string1:"+str1);
		 System.out.println("String2:"+str2);
	}
}
