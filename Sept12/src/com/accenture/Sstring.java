package com.accenture;

public class Sstring {
	public static void main(String[] args) {
		String s1="accenture";
		String s3="accenture";
		String s2=new String("accenture");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //compare referances(locations)
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));//content
		s1.concat(" company");
		System.out.println(s1);
		
		String s4=s1.concat(" company");
		System.out.println(s4);
		
	}

}
