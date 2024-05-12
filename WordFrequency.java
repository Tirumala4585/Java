package com.stringprograms;
import java.util.Map;
import java.util.TreeMap;
public class WordFrequency {
	public static void main(String []args)
    {
         String str="Learning to code is learning to create and innovate";	
         String[] arr = str.split(" ");
         Map<String,Integer> map = new TreeMap<>();
         int count=1; 
         for(int i=0;i<arr.length;i++)
         {
            count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equalsIgnoreCase(arr[j]))
                {
                    count++;
                }
            }
            map.put(arr[i],count);
         }    
         System.out.println(map);  
    }


}
