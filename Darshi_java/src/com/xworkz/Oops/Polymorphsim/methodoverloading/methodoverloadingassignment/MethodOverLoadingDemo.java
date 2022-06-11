package com.xworkz.Oops.Polymorphsim.methodoverloading.methodoverloadingassignment;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
    int result=Multiplication.Mul(25,30);
    double result1=Multiplication.Mul(50.1, 100.5);
    System.out.println("Mul of two integer number is:"+result);
    System.out.println("Mul of two integer number is:"+result1);
	}

}
/*
Mul of two integer number is:750
Mul of two integer number is:5035.05
*/