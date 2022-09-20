package com.accenture;

public class Sstringbuffer {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("accenture");
		s.append(" company");
		System.out.println(s);
		
		StringBuilder s1=new StringBuilder("accenture");
		s1.append(" company");
		System.out.println(s1);
	}

}
