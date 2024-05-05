package com.stringprograms;

public class ReplaceSpaces {
	public static void main(String []args)
	{
		String str1 = "Java is a object oriented programming language";
        char[] ch = str1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                 ch[i]='-';
            }
        }
        String str2 = new String(ch);
        System.out.println(str2);  
	}

}
