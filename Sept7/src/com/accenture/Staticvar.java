package com.accenture;

public class Staticvar {
	static int count = 0;
	static {
		System.out.println("static block");
	}
	public static void Incr()
	{
		count++;
		System.out.println("count is "+count);
	}
	public static void main(String[] args) {
		Staticvar d=new Staticvar();
		Staticvar d1=new Staticvar();
		//d.Incr();
		d.Incr();
		//d1.Incr();
		d1.Incr();
	}
}
