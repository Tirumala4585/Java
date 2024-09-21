package com.stringprograms;

public class InsertionSort {
	public static void insertionSort(int[] a)
    {
       int size=a.length;
       int temp,i,j;
       for(i=1;i<size;i++)
        {
            temp=a[i];
            j=i-1;
            while((j>=0) && (temp<a[j]))
            {                    
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
	public static void main(String []args)
	{
		int[] a = {30,10,40,20,50}; 
        System.out.println("Before Insertion sort");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        } 
        System.out.println();
        insertionSort(a);
        System.out.println("After Insertion Sort");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
	}
}
