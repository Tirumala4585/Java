package com.stringprograms;

public class RemoveDuplicateElements {
	  public static void main(String []args)
	  {
		  String str1="ABCAABBC";
		  StringBuilder sb = new StringBuilder();
		  boolean flag;
		  for(int i=0;i<str1.length();i++)
		  {
			  flag=false; 
			  for(int j=i+1;j<str1.length();j++)
			  {
				  
				  if(str1.charAt(i)==str1.charAt(j))
				  {
					  flag=true;
					  break;
				  }
			  }
			  if(!flag)
			  {
				  sb.append(str1.charAt(i));
			  }
		  }
		  String str2=sb.toString();
		  System.out.println("String before removing duplicate characters : "+str1);
		  System.out.println("String after removing duplicate characters : "+str2);
	  }

}
