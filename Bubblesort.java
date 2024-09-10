package com.stringprograms;

public class Bubblesort {
	public static void main(String []args) 
	   {
	       int[] arry = {6,0,3,5};
	       int count = arry.length;
	       int temp;
	       System.out.println("Array elements before sorting");
		   for(int i=0;i<count;i++)
		   {
		        System.out.print(arry[i]+" ");
		   }
		   System.out.println();   
	       for(int i=1;i<count;i++)
	       {
	          for(int j=0;j<count-1;j++)
	          {
	              if(arry[j]>arry[j+1])
	              {
	                  temp=arry[j];
	                  arry[j]=arry[j+1];
	                  arry[j+1]=temp;
	               }
	          }
	      } 
	      System.out.println("Array elements after sorting");
	      for(int i=0;i<count;i++)
	      {
	          System.out.print(arry[i]+" ");
	      }
	  }


}
