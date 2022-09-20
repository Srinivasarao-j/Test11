package com.accenture;

class VoterException extends Throwable  //or Exception
{
public VoterException(String str) {
	super(str);
}
}

public class UserExceptions {
	public static void main(String[] args) throws VoterException {
		int age = 16;
		if(age<=18) {
			throw new VoterException("not eligible age < 18");
		}
		else {
			System.out.println("eligible for Vote");
		}
	}

}
