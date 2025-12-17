package org.test;

public class DemoConstructor2  {
	public DemoConstructor2() {
		
		System.out.println("Default2 constructor");
	}
	public DemoConstructor2(int atm) {
		this ("20/12/2025");
		System.out.println(atm);
	}
	
	public DemoConstructor2(String date){
		this ();
		System.out.println(date);	
	}
	
	

}
