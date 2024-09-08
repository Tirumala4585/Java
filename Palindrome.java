package com.stringprograms;

public class Palindrome {
	public static void main(String []args)
    {
       int n=5000;
       int digit,rev,temp,i;
       i=1000;
       System.out.println("Random Palindrome numbers between "+i+" to "+n);
       while(i<n)
       {
           digit=0;
           rev=0;
           temp=i;
           while(temp>0)
           {
              digit=temp%10;
              rev=rev*10+digit;
              temp=temp/10;
           }
           if(rev==i)
           {
               System.out.println(rev);
           } 
           i=i+2;
        } 
    }
}
