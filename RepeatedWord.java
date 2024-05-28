package com.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class RepeatedWord {
	 public static void main(String []args)
	    {
	       try{
	        ArrayList<String> list = new ArrayList<>();
	        FileReader file = new FileReader("D://Data1.text");
	        BufferedReader br = new BufferedReader(file);
	        String line;
	        while((line=br.readLine())!=null)
	        {
	             String[] words = line.split(" ");
	             for(String s:words)
	             {
	                list.add(s);
	             }
	        }
	       int count,maxcount=0;
	       String maxword=""; 
	       for(int i=0;i<list.size();i++)
	       {
	          count=1;
	          for(int j=i+1;j<list.size();j++)
	          {
	              if(list.get(i).equals(list.get(j)))
	              {
	                   count++;
	               }
	          }
	          if(count>maxcount)
	          {
	             maxcount=count;
	             maxword = list.get(i);
	          }
	        }
	        System.out.println("Most Repeate Word : "+maxword); 
	                  
	      }
	      catch(Exception ie)
	      {
	         ie.getMessage();
	      }
	    }
}
