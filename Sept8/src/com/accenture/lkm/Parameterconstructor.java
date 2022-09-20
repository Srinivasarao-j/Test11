package com.accenture.lkm;

class Std{
	private int stdid;
	private String stdaddress;
	Std(int stdid,String stdaddress)
	{
		this.stdid=stdid;
		this.stdaddress=stdaddress;
	}
	void showInfo() {
		System.out.println(stdid+" "+stdaddress);
	}
}

public class Parameterconstructor {
	public static void main(String[] args) {
		Std s=new Std(101,"hyd");
		s.showInfo();
	}

}
