package org.test;

public class Cons {
	
	int a=10;
	int b=20;
	
	
	public void a() {
		System.out.println(a++);
		
	}
	
	public void b() {
		System.out.println(++a);
		
	}
	
	public static void main(String[] args) {
		Cons c=new Cons();
		c.b();   
		c.a();
		
		

	}

}
