package com.stringprograms;
import java.lang.StringBuilder;
public class StringPalindrome {
	public static void main(String []args)
	{
	String str1="Madam";
    StringBuilder sb = new StringBuilder();
    for(int i=str1.length()-1;i>=0;i--)
    {
        sb.append(str1.charAt(i));
    }
    String str2=sb.toString();
    if(str1.equalsIgnoreCase(str2))
    {
       System.out.println(str1+" string is Palindrome");
    }
    else
    {
       System.out.println("Given string is not a Palindrome");
    }
  }
}
