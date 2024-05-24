package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo1 {
	public static void main(String []args)
	{
		int index;
		List<String> list =  new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("Grapes");
		ListIterator itr = list.listIterator(list.size());
		while(itr.hasPrevious())
		{
		    System.out.println(itr.previous());
		}
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr = list.listIterator();
		itr.next();
		itr.add("Banana");
		System.out.println(list);
		itr.next();
		itr.set("Lemon");
		System.out.println(list);
		itr.next();
		itr.remove();
		System.out.println(list);
	}

}
