package com.accenture.lkm;
//bean or pojo
public class Studentpojo {
	int stdid;
	String stdname;
	String stdadd;
	
	
	public Studentpojo() {
		System.out.println("Deafult Constructor");
	}

	public Studentpojo(int stdid, String stdname, String stdadd) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdadd = stdadd;
	}

	@Override
	public String toString() {
		return "Studentpojo [stdid=" + stdid + ", stdname=" + stdname + ", stdadd=" + stdadd + "]";
	}
	
}
