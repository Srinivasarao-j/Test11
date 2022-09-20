package com.accenture;

public class Classexp {
	private int empid=101;//data member1
	private String empname="srinu";//member2
	public void showInfo() {
		System.out.println(empid +" "+empname);
	}
	public static void main(String[] args) {
		Classexp emp=new Classexp();
		emp.showInfo();
	}
}//end of class


