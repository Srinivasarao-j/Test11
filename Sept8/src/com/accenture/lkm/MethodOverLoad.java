package com.accenture.lkm;

public class MethodOverLoad {
	public void getInfo() {
		System.out.println("without any parameters");
	}
	public void getInfo(int a) {
		System.out.println("a value is "+a);
	}
	public static void main(String[] args) {
		MethodOverLoad d=new MethodOverLoad();
		d.getInfo();
		d.getInfo(100);
	}

}
