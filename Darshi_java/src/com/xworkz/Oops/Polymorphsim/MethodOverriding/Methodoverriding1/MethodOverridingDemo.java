package com.xworkz.Oops.Polymorphsim.MethodOverriding.Methodoverriding1;

public class MethodOverridingDemo {

	public static void main(String[] args) {
	RBI rbi=new RBI();
	BankOfBoroda bankofBoroda=new BankOfBoroda();
	SBI sbi=new SBI();
	bankofBoroda.RateofIntrest();
	sbi.RateofIntrest();
	rbi.RateofIntrest();
	

	}

}
/*
BankofBaroda rate of Intrest is 7.5%
SBI rate of intrest is 7%
RBI rate of intrest is 8%
*/