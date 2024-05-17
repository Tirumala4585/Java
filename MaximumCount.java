package stringprograms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MaximumCount {
     public static void main(String []args) {
    	   try {
    	 	String line;
    	 	String word;
    	 	int count=0;
    	 	int maxcount=0;
    	 	String maxword = "";
    	 	ArrayList<String> words = new ArrayList<String>();
    	 	FileReader file = new FileReader("F:\\Data.text");
    	 	BufferedReader br = new BufferedReader(file);
    	 	while((line=br.readLine())!=null)
    	 	{
    	 		String[] ch = line.split(" ");
    	 		for(String w:ch)
    	 		{
    	 			words.add(w);
    	 		}
    	 	}
    	 	System.out.println(words);
    	 	for(int i=0;i<words.size();i++)
    	 	{
    	 		count=1;
    	 		for(int j=i+1;j<words.size();j++)
    	 		{
    	 			if(words.get(i).equals(words.get(j))) {
    	 				count++;
    	 			}
    	 		}
    	 		if(count>maxcount)
    	 		{
    	 			maxcount=count;
    	 			maxword=words.get(i);
    	 		}
    	 	}
    	 	
    	 	
    	 	
    	 	 System.out.println("Maximum occurance:"+maxword);
    	   }
    	 	catch(Exception ie) {
    	 	   ie.getMessage();
    	 	}
	}

}
