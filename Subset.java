
package com.stringmethods;

public class Subset {
	public static void main(String []args)
	{
		String str="ABC";
		int length=str.length();
		String[] arr = new String[(length*(length+1)/2)];
		int temp=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++)
			{
				arr[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
	}

}
