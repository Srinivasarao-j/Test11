package com.accenture.ex;
@FunctionalInterface
interface Test{
	void show();		
}

public class Llamda{
	public static void main(String[] args) {
		
		Test t=()->{System.out.println("Lamda expression is executed");};
		t.show();
	}

}
