package com.xworkz.Oops.Encapsulation.EncapsulationDemo;

public class TestDog {

	public static void main(String[] args) {
      Dog dog=new Dog();
      dog.setName("sony");
      dog.setColor("black");
      dog.setBreed("german");
      dog.setAge(22);
      dog.setPrice(20000.00);

      System.out.println("name :"+dog.getName());
      System.out.println("color :"+dog.getColor());
      System.out.println("breed :"+dog.getBreed());
      System.out.println("age :"+dog.getAge());
      System.out.println("price :"+dog.getPrice());
     
	}

}
