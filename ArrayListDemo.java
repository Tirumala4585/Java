package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String []args)
	   {
	           List<Integer> list = new ArrayList<>();
	           list.add(1);
	           list.add(2);
	           list.add(3);
	           list.add(4);
	           Iterator<Integer> itr = list.iterator();
	           while(itr.hasNext())
	           {
	                 int i=itr.next();
	                 if(i>=3) {
	                	 itr.remove();
	                 }
	           }
	         System.out.println("Removing last element:"+list);
	    }

}
