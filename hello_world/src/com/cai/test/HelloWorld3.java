package com.cai.test;

import java.io.PrintStream;

public class HelloWorld3 {
	
	public static void main(String... args) {
		System.out.println("1. Hello world!");
		System.err.println("2. Hello world!");
		System.out.print("3. Hello World");
		
		PrintStream ps = new PrintStream(System.out);
		String s = "4. Hello World";
	    // print string
	    ps.println(s);
	    ps.println(" This is an example");
	    // flush the stream
	    ps.flush();
	    
	    PrintStream psErr = new PrintStream(System.err);
	    // print string
		psErr.println(s);
		psErr.println(" This is an example");
	    // flush the stream
		psErr.flush();
	    
		System.runFinalization();

	}
}
