package com.accenture;

public class GetSetUse {
	public static void main(String[] args) {
		Demogetset d=new Demogetset();
		d.setEmpid(101);
		d.setEmpname("srinu");
		d.setEmpaddress("madinapadu");
		d.setEmpsalery(10000);
		d.setAge(23);
		//System.out.println(d.getEmpid()+" "+d.getEmpname()+" "+d.getEmpaddress()+" "+d.getAge()+" "+d.getEmpsalery());
		System.out.println(d);
	}

}
