package com.xworkz.Operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int x=10;
		int y=x++;//y=10,x=11
		int z=y--;//z=10,y=9
		System.out.println(x);//11
		System.out.println(x--);//11
		System.out.println(z++);//10
		System.out.println(--y);//8
		System.out.println(z);//11
		

	}

}
