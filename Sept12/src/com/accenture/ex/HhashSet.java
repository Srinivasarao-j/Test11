package com.accenture.ex;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HhashSet {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add("A");
		h.add("Accenture");                  //not fst in fst out
		h.add(null);
		h.add(10);                          //duplicates not allowed
		
		System.out.println(h);  
		
		LinkedHashSet h1=new LinkedHashSet();
		h1.add(10);
		h1.add(20);
		h1.add("A");
		h1.add("Accenture");                  // fst in fst out(insertion order)
		h1.add(null);
		h1.add(10);                          //duplicates not allowed
		
		System.out.println(h1);

	}

}
