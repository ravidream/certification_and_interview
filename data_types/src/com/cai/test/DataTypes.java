package com.cai.test;

public class DataTypes {
	 
	 public static void main(String[] args) {
	 
	 byte byteDataType = 127;
	 //Change the value of byte data type to 128 and you will find an error. The range of byte is from -128 to 128
	 //byte byteDataTypeNew = 128;
	 short shortDataType = 128;
	 //Change the value of byte data type to 32768 and you will find an error. The range of byte is from -32768 to 32767
	 //short shortDataTypeNew = 32768;
	 int intDataType = 32768;
	 long longDataType = 2147483648L;
	 float floatDataType = 20.99F;
	 double doubleDataType = 49999999.9d;
	 char charDataType = 'M';
	 boolean booleanDataType = true;
	 
	 System.out.println(byteDataType);
	 System.out.println(shortDataType);
	 System.out.println(intDataType);
	 System.out.println(longDataType);
	 System.out.println(floatDataType);
	 System.out.println(doubleDataType);
	 System.out.println(charDataType);
	 System.out.println(booleanDataType);
	 }
	 
	}