package com.xworkz.Oops.Abstraction.interfacemethod.interfacemethod1;

public class InterfaceDemo {

	public static void main(String[] args) {
       Computer computer=new Computer();
       Sony sony=new Sony();
       Epson epson=new Epson();
      computer.slot(epson);
      computer.slot(sony);
      
	}

}
