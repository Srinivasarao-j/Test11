package com.accenture.ex;

import java.util.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class Llist {
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();  //fst in fst out
		a.add(10);
		a.add(10);
		a.add(20);
		a.add(10);
		a.add(30);
		a.add(40.7f);
		a.add("srinu");
		//a.add(null);
		a.remove(0);
		//a.clear();
		//System.out.println(a.contains("srinu"));
		
		/*  ArrayList a1=new ArrayList();
		a1.addAll(a);
		System.out.println(a);
		System.out.println(a1);   */
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a);
		}
		//forEach loop
		a.forEach((x) -> System.out.println(x));
		
		//iterator
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		}

}
