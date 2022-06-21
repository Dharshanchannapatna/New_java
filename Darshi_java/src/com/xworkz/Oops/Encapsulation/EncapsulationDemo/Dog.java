package com.xworkz.Oops.Encapsulation.EncapsulationDemo;

public class Dog {
	private String name;
	private String color;
	private String breed;
	private int age;
	private double price;
	
	public void setName (String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
		
	}
	public void setColor (String color) {
		this.color=color;
	
	}
	public String getColor () {
		return color;
		
	}
	public void setBreed(String breed) {
		this.breed=breed;
		
	}
	public String getBreed() {
		return breed;
	}
	
	public void setAge(int age) {
		if (age<100) {
			this.age= age;
		}
		else {
			System.out.println("Invalid age value");
		}

	}
	public int getAge() {
		return age;
		
	}
	public void setPrice(double price) {
		this.price=price;
		
	}
	public double getPrice() {
		return price;
	}
	

}
