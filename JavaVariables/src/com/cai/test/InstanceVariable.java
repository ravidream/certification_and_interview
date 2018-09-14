package com.cai.test;

public class InstanceVariable {

	String myInstanceVar="instance variable";
	int i;
	
	   public static void main(String args[]){
		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		InstanceVariable obj3 = new InstanceVariable();
			
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

			
		obj2.myInstanceVar = "Changed Text";

			
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		System.out.println("i : "+obj.i);
	   }
}
