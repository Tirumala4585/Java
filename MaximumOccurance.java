package com.programs;

import java.util.Scanner;

public class MaximumOccurance {
	public static void main(String []args)
	{
		    Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the string");
		    String str= sc.nextLine();  
		    int[] count = new int[str.length()];
		    char minchar =str.charAt(0);
		    char maxchar = str.charAt(0);
		    int max,min,i,j;
		    char[] string = str.toCharArray();
		    for(i=0;i<string.length;i++)
		    {
		    	   count[i]=1;
		    	   for(j=i+1;j<string.length;j++)
		    	   {
		    		   if(string[i]==string[j])
		    		   {
		    			   count[i]++;
		    			   string[j]='0';
		    		   }
		    	   }
		    }
		    min=max=count[0];
		    for(i=0;i<count.length;i++)
		    {
		    	if(count[i]>max)
		    	{
		    		max=count[i];
		    		maxchar = string[i];
		    		
		    	}
		    	if(count[i]<min&&string[i]!=0)
		    	{
		    		min=count[i];
		    		minchar = string[i];
		    		
		    	}
		    }
		    System.out.println("Maximum occurance of a character: "+maxchar);
		    System.out.println("Minmum occurance ofa character:"+minchar);
		    
	}

}
