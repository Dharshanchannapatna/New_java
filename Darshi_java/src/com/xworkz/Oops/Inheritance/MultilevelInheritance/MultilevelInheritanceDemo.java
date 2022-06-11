package com.xworkz.Oops.Inheritance.MultilevelInheritance;

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Kgf2 k2=new Kgf2();
		Kgf1 k1=new Kgf1();
		k2.action();
		k2.love();
		k2.quality();
		k2.budget();
		k2.quality();
	}

}
/*
 Kgf1 films as more action scenes
Heroin loves Hero in film
Movie quality will be HD print 
Movie making budget will be 200cr
Movie quality will be HD print
*/
