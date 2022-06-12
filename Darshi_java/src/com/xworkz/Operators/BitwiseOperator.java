package com.xworkz.Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println((x<y) | (x>y++));//true
		System.out.println(x);//10
		System.out.println(y);//21
		System.out.println((x<y) & (x>y++));//false
		System.out.println((x<y) ^ (x>y++));//true
		System.out.println(x);//10
		System.out.println(y);//23
		

	}

}
