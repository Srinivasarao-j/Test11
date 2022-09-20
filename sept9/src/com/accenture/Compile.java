package com.accenture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compile {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enetr student name");
		String name = br.readLine();
		System.out.println(name);
	}

}
