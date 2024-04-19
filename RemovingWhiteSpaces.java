package com.stringprograms;

public class RemovingWhiteSpaces {
	public static String removeWhitespaces(String str)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' '&&str.charAt(i)!='\t'&&str.charAt(i)!='\n')
			{
				sb.append(str.charAt(i));
			}
			
		}
		return sb.toString();
	}
	public static void main(String []args)
	{
		String str="J av a L ang ua ge";
		System.out.println("Before removing white spaces : "+str);
		System.out.println("After removing white spaces : "+removeWhitespaces(str));
	}

}
