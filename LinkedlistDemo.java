package com.enumration;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
	public static void main(String []args)
	{
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Java");
		l1.add("Pyhton");
		l1.addFirst("MYSQL");
		l1.addLast("PHP");
	    Enumeration<String> e = Collections.enumeration(l1);
	    while(e.hasMoreElements())
	    {
	    	System.out.println(e.nextElement());
	    }
	}     
}
