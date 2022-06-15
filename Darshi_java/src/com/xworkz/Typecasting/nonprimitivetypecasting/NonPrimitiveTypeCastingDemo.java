package com.xworkz.Typecasting.nonprimitivetypecasting;

public class NonPrimitiveTypeCastingDemo {

	public static void main(String[] args) {
      System.out.println("main started....");
      //upcasting
        Animal animal=new Tiger();
        
        //downcasting
        Tiger tiger=(Tiger)animal;
       System.out.println("main ended....");
	}

}
