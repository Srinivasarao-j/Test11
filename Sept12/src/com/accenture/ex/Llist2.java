package com.accenture.ex;

import java.util.LinkedList;

public class Llist2 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(10);
		l.add("srinu");
		l.add(12.5f);
		l.remove(1);
		
		System.out.println(l);
	}

}
