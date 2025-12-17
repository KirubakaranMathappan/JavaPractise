package org.test;

public class DemoConstructor extends DemoConstructor2{
	public DemoConstructor() {
		this ("palladam",5443);
		System.out.println("Default constructor");
	}
	public DemoConstructor(int a) {
		this ();
		 		System.out.println(a);
	}
	
	public DemoConstructor(String name){
		this (29);
		System.out.println(name);	
	}
	
	public DemoConstructor(String address,int pcode){
		super (1234); 
		System.out.println(address + " "+ pcode );
	}
	
	public static void main(String[] args) {
		
		new DemoConstructor("Kiruba");
	}

	
	
	
	
}
