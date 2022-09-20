package com.accenture.lkm;

public class ConstructorOverLoad {
	ConstructorOverLoad(int a){
		System.out.println("a is "+a);
	}
	ConstructorOverLoad(int a,int b){
		System.out.println("a,b are "+a+","+b);
	}
	public static void main(String[] args) {
		ConstructorOverLoad d=new ConstructorOverLoad(10);
		ConstructorOverLoad d1=new ConstructorOverLoad(10,20);
	}

}
