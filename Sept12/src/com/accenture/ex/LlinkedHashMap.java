package com.accenture.ex;

import java.util.LinkedHashMap;

public class LlinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap h=new LinkedHashMap();
		h.put(1, "Accenture");
		h.put(2, 100);
		h.put(3, "a");
		h.put(1, "Srinu");
		h.put(4, 100);
		h.put(5, null);
		h.put(null, null);
		
		System.out.println(h);
		
	}

}
