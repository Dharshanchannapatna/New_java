package com.xworkz.Oops.Polymorphsim.MethodOverriding.MethodoverridingAssignment;

public class MethodoverridingDemo {

	public static void main(String[] args) {
     Vechicle vechicle=new Vechicle();
     Bike bike=new Bike();
     Car car=new Car();
     vechicle.compantname="Honda";
     vechicle.location="Channapatna";
     bike.name="Hero Honda";
     car.name="Honda Accord";
     bike.Run();
     car.Run();
     System.out.println("vechicle Companyname:"+vechicle.compantname);
     System.out.println("vechicle location:"+vechicle.location);
     System.out.println("Bike name:"+bike.name);
     System.out.println("car name:"+car.name);
	}
	

}
/*
Bike is running safely
car is running fast
vechicle Companyname:Honda
vechicle location:Channapatna
Bike name:Hero Honda
car name:Honda Accord
*/