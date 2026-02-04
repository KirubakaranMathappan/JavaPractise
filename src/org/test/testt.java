package org.test;

public class testt {

	public static void main(String[] args) {
		
	int n=7;
	boolean status=true;
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			status=false;
			break;
		}
	}
	if(status==true) {
		System.out.println("prime");
	}else {
		System.out.println("not prime");
	}
	
	
	String s="Kiruba!k@rAN);12OO";
	
	String replaceAll = s.replaceAll("[^a-zA-Z]", "");
	System.out.println(replaceAll);
	
	String replaceAll2 = s.replaceAll("[a-zA-Z0-9]","");
	System.out.println(replaceAll2);
	
	String replaceAll3 = s.replaceAll("[^0-9]","!");
	System.out.println(replaceAll3);
	
	String[] split = s.trim().split("[^a-zA-z]");
	for(String sa:split) {
		System.out.println(sa);
	}
	
	String[] split2 = s.split("\\W");
	for(String sp2:split2) {
		System.out.println(sp2);
	}
	
	}
}
