package com.stringmethods;

public class Count {
	public static void main(String []args)
	{
		String str="Java is a  Objected Oreinted Programming Lanaguage";
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			count++;
		}
		System.out.println(str);
		System.out.println("No of words in a given string : "+count);
		
	}

}
