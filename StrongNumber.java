package com.basic;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp,digit,fact;
		temp=n;
		int sum=0;
		while(n>0) {
			digit=n%10;
			fact=1;
			for(int i=1;i<=digit;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{ 		
		
		   System.out.println("Given number is a Strong number");
	}
	else {
		System.out.println("Given number is not a strong number");
	}
 }

}
