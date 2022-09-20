package com.accenture.lkm;

class P1{
	void displayInfo(){
		System.out.println("Parent Class");
	}
}
class C1 extends P1{
	void showInfo() {
		System.out.println("Child Class");
	}
}
class C1C1 extends C1{
	void getInfo() {
		System.out.println("Child Child Class");
	}
}
public class Multiinheritance {
	public static void main(String[] args) {
		C1C1 c=new C1C1();
		c.displayInfo();
		c.showInfo();
		c.getInfo();

		
	}

}
