package com.xworkz.Oops.Encapsulation.Encapsulation1;

public class TestEmployee {

	public static void main(String[] args) {
       Employee emp=new Employee();
     
       emp.SetName("Darshi");
   	   emp.SetId(100);
	
	emp.GetName();
	emp.GetId();
	System.out.println("Name:"+emp.GetName());
	System.out.println("id:"+emp.GetId());

	}

}
