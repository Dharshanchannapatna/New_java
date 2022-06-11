package com.xworkz.Oops.Constructor.DefaultConstructor;

public class DefaultConstructorDemo {

	public static void main(String[] args) {
       Gun gun=new Gun();
       System.out.println("Gun Details");
       System.out.println("Gun color:"+gun.color);
       System.out.println("Gun noOfBullets:"+gun.noOfBullets);
       System.out.println("Gun Weight:"+gun.weight);

	}

}
/* 
Gun Details
Gun color:null
Gun noOfBullets:0
Gun Weight:0.0
*/