package com.accenture.ex;

import java.util.TreeMap;

public class TtreeMap {
	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(1, "Accenture");
		t.put(2, 100);
		t.put(3, "a");
		t.put(1, "Srinu");
		t.put(4, 100);
		t.put(5, null);
		
		
		System.out.println(t);
	}

}
