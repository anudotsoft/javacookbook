package com.accessSpecifier;


import com.access.ProtectedExample;
import com.access.PublicExampleCode;

public class Example {

	public static void main(String[] args) {
		PublicExampleCode PE=new PublicExampleCode();
		System.out.println(PE.a);
		System.out.println(PE.b);
		System.out.println(PE.x);
		System.out.println(PE.y);
		//System.out.println(PE.p);
		int c=PE.p;
		
		ProtectedExample p=new ProtectedExample();
		
		
		

	}

}
