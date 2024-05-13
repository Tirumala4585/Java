package com.stringprograms;

public class NEqualParts {
	public static void main(String []args)
	{
		String str ="Tirumalarao Jami";
	       int n=4;
	       int len=str.length();
	       int chars=len/n;
	       int temp=0;
	       String[] equalstr = new String[n];
	       if(len%n!=0)
	       {
	          System.out.println("Dividing the string into n equal parts is not possible");
	       }
	       else
	       {
	          for(int i=0;i<len;i=i+chars)
	          {
	              equalstr[temp]= str.substring(i,chars+i);
	              temp++;          
	          } 
	          for(int i=0;i<equalstr.length;i++)
	          {
	            System.out.println(equalstr[i]);
	          }
	       }

	}

}
