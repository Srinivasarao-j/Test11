package com.accenture.ex;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HhashMap {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(1, "Accenture");
		h.put(2, 100);
		h.put(3, "a");
		h.put(1, "Srinu");
		h.put(4, 100);
		h.put(5, null);
		h.put(null, null);
		
		System.out.println(h);
		
		
		LinkedHashMap h1=new LinkedHashMap();
		h1.put(1, "Accenture");
		h1.put(2, 100);
		h1.put(3, "a");
		h1.put(1, "Srinu");
		h1.put(4, 100);
		h1.put(5, null);
		h1.put(null, null);
		
		System.out.println(h1);
	}

}
