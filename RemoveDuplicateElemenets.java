package Arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElemenets {
	public static void main(String []args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(7);
		primes.add(11);
		System.out.println("Primes Numbers:"+primes);
		Set<Integer> set = new LinkedHashSet<Integer>(primes);
		primes.clear();
		primes.addAll(set);
		System.out.println("Primes Numbers without duplicate elements:"+primes);
		
	}

}
