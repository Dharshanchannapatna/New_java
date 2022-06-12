package com.xworkz.Operators;

public class logicalOperators {

	public static void main(String[] args) {
		int a=25;
		int b=56;
		System.out.println("(a==b)||(a<b)"+":"+ ((a==b)||(a<b)));//true
		System.out.println("(a==b)&&(a<b)"+":"+ ((a==b)&&(a<b)));//false
		System.out.println("(a!=b)||(a<b)"+":"+ ((a!=b)||(a<b)));//true
       System.out.println((++a>b)||(a>b));//false
       System.out.println((++a>b--)||(++a>b--));//false
       System.out.println(a);//28
       System.out.println(b);//54
       
       
	}

}
