package com.xworkz.Pattern;

public class Pattern10 {
	public static void main(String[] args) {
		int n=5;
	    for (int i=1,p=0; i<=n;i++,p+=2) {
	    	for (int j=1; j<=i;j++) {
	    		System.out.print(p+"");
	    	}
	    	System.out.println();
	    }
		}

}
/*
 0
22
444
6666
88888
*/
