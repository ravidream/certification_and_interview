package com.cai.test;

public class ClassOrStaticVariable {

	public static String myClassVar="class or static variable";
	public static int i;
	
	   public static void main(String args[]){
		  ClassOrStaticVariable obj = new ClassOrStaticVariable();
		  ClassOrStaticVariable obj2 = new ClassOrStaticVariable();
		  ClassOrStaticVariable obj3 = new ClassOrStaticVariable();
	      
	      //All three will display "class or static variable"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);

	      //changing the value of static variable using obj2
	      obj2.myClassVar = "Changed Text";

	      //All three will display "Changed Text"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);
	      
	      System.out.println("i : "+i);
	   }
}
