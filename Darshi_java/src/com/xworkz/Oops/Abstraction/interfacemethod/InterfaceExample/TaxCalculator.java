package com.xworkz.Oops.Abstraction.interfacemethod.InterfaceExample;

public class TaxCalculator implements StateTax,CentralTax {
    public void petroltax() {	
    	System.out.println("petrol tax is 10rs");
    }
    public void electricitytax() {
    	System.out.println("electriccity tax is 5rs");
    }
}
