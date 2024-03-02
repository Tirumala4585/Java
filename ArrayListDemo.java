package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String []args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(50);
		//System.out.println(arrlist);
		//for(int arr:arrlist) {
			//System.out.println(arr);
		//}
	    Iterator<Integer> it = arrlist.iterator();
	    while(it.hasNext()) {
	    	 System.out.println(it.next());
	    	
	    }
	}

}

