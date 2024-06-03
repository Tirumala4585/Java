package com.collectionprograms;

public class MissingNumber {
	public static void main(String []args)
	{
		int[] arry = {1,2,3,4,5,6,7,8,10};
		int sum=0;
		int n=arry.length+1;
		int totalsum = (((n)*(n+1))/2);
		for(int i=0;i<arry.length;i++)
		{
			sum=sum+arry[i];
		}
		int missingnumber = totalsum-sum;
		System.out.println(missingnumber);
	}

}
