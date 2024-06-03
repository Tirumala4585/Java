package com.collectionprograms;
import java.util.*;
public class SplitList {
	public static void main(String []args) {
		List<Integer> inputlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> firstlist = new ArrayList<Integer>();
		List<Integer> secondlist = new ArrayList<Integer>();
		int len = inputlist.size();
		for(int i=0;i<len/2;i++)
		{
			firstlist.add(inputlist.get(i));
		}
		for(int j=len/2;j<len;j++) {
			secondlist.add(inputlist.get(j));
			
		}
		System.out.println(inputlist);
		System.out.println(firstlist);
		System.out.println(secondlist);
		
	}

}
