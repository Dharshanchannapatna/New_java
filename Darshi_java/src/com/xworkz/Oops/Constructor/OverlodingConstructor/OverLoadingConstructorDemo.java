package com.xworkz.Oops.Constructor.OverlodingConstructor;

public class OverLoadingConstructorDemo {

	public static void main(String[] args) {
     Gun gun=new Gun();
     Gun gun1=new Gun("Black",10,10.20);
     System.out.println("Gun details");
     System.out.println("Gun color:"+gun.color);
     System.out.println("Gun noOfBullets:"+gun.noOfBullets);
     System.out.println("Gun weight:"+gun.weight);  
     
     System.out.println("Gun1 details");
     System.out.println("Gun1 color:"+gun1.color);
     System.out.println("Gun1 noOfBullets:"+gun1.noOfBullets);
     System.out.println("Gun1 weight:"+gun1.weight);  
     
	}

}
