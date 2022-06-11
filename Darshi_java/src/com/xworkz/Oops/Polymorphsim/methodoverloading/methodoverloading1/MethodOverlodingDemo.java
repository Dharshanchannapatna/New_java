package com.xworkz.Oops.Polymorphsim.methodoverloading.methodoverloading1;

public class MethodOverlodingDemo {

	public static void main(String[] args) {
    Manoj manoj=new Manoj();
    Friend friend=new Friend();
    unknown unknown=new unknown();
    manoj.speak(friend);
    manoj.speak(unknown);

	}

}
/*Hi good morning
Hello good morning
*/