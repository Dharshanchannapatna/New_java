package com.xworkz.Typecasting.Primitivetypecasting;

public class PrimitiveTypeCastingDemo {

	public static void main(String[] args) {
		//implicits/widening/automatic
     byte b=10;
     short s=b;
     System.out.println("b:"+b);
     System.out.println("s:"+s);
     
     //explicit/narrowing/manual
     short s1=100;
     byte b1=(byte)s1;
     System.out.println("s1:"+s1);
     System.out.println("b1:"+b1);
     
	}

}
