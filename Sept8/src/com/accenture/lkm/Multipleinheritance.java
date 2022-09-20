package com.accenture.lkm;

class Parent1 {
	void getInfo() {
		System.out.println("Parent class");
	}	
}
interface Parent2{
	void showInfo();  // abstract
	
}
class Child1 extends Parent1 implements Parent2{
	public void showInfo() {
		System.out.println("implementing abstract method");
	}
}
public class Multipleinheritance {
	public static void main(String[] args) {
		Child1 c=new Child1();
		c.getInfo();
		c.showInfo();

	}

}
