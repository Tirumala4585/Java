package com.stringprograms;

public class Bubblesort {
    public static void sortting(int[] a)
     {
       int temp;
       for(int i=0;i<a.length;i++)
       {
             for(int j=0;j<a.length-1;j++)
             {
               if(a[j]>a[j+1])
               {
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
               }
             } 
        }
        System.out.println("After sorting an Array");
        for(int i=0;i<a.length;i++)
        {
             System.out.println(a[i]);
        }  
    }
    public static void main(String []args)
    {
          int[] a = {30,10,40,20,50};
          System.out.println("Before sorting an Array");
          for(int i=0;i<a.length;i++)  
          {
             System.out.println(a[i]);
          }
          sortting(a); 
   }
}
