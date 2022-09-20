package com.accenture.lkm;

public class Nmbcompare {
	public static void main(String[] args) {
		int n1=58;
		int n2=65;
		Nmbcompare compare=new Nmbcompare();
		int maximum = compare.findMaximum(n1,n2);
		System.out.println("Maximum number is "+maximum);		
	}
	public int findMaximum(int n1,int n2) {
		if(n1>n2) {
			return n1;
		}
		return n2;		
	}
}
