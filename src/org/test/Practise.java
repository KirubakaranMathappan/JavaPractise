package org.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practise {
	public static void main(String[] args) {
		
		
	String a="2";
	String b="4";
	
	int c=Integer.parseInt(a);
	int d=Integer.parseInt(b);
	
	System.out.println(c+d);
	
	int a1[] = {3,6,9};
	 
		System.out.println(a1[1]*2);
		System.out.println(6 % 4);
		System.out.println(15 / 4);
	
		int x=9;
		if (x % 2 == 0) {
			System.out.println("Even");			
		}
		else {
			System.out.println("odd");
		}
	
	
		if ('A'>'a'){
			System.out.println("hello");
		}
		else {
			System.out.println("world");
		}
		
		String name="Computer";
		
		System.out.println("length of String :" + name.length());
		System.out.println("Sub Stirng :" + name.substring(1,4));
		
		
		String course="Java";
		String course1="html";
		String course2="phython";
		if (course==course1 || course==course2) {
			System.out.println("Couesr Valid");
		}
		else {
			System.out.println("NOT valid");
		}
		
		
		if(course.equals(course1)|| course.equals(course2)) {
			System.out.println("Couesr Valid");
		}
		else {
			System.out.println("NOT valid");
		}
		
		
		
		int n=6;
		
		for (int i=1;i<n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print(" ");				
			}
			System.out.println("");
		}
				
//		System.out.println("");
		
		for (int i=1;i<n;i++) {
			for (int j=1;j<n-i;j++) {
				System.out.print(j);
				System.out.print(" ");				
			}
			System.out.println("");
		}
				
		
		
		/*
		   i=1 space=5 n=6 star=1       formula ===>  2*i-1
		   i=2 space=4 n=6 star=3
		   i=3 space=3 n=6 star=5
		   i=4 space=2 n=6 star=7
	 	   i=5 space=1 n=6 star=9		   
		*/
		
		
		for (int i=1;i<n;i++) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");				
			}
			for (int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		   i=1 space=2 n=6 star=7        formula ====> (n-i)*2-3
		   i=2 space=3 n=6 star=5
		   i=3 space=4 n=6 star=3
		   i=4 space=5 n=6 star=1
	 	 		   
		*/
		
		
		//  formula ====> (n-i)*2-3
		
		for (int i=1;i<n;i++) {
			for (int j=1;j<=i+1;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=(n-i)*2-3;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int[] a10= {3,6,9};

		for (int i=0;i<a10.length;i++) {
			a10[i]= a10[i] * 2;
		}
		System.out.println(Arrays.toString(a10));
		
		int a12[]= {5, 7, 9};
		
		for(int y:a12) {
			System.out.println(y * 2);
		}
		
		String s="TamilNadu";
		String s1="WoW";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(3));
		System.out.println(s.codePointAt(1));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(1, 5));
		System.out.println(s.concat(s1));
		System.out.println(s);
		System.out.println(s1);
		StringBuffer sb=new StringBuffer(s);
		StringBuffer s2 = sb.append(s1);
		System.out.println(s2);
		System.out.println(s.contains("T"));
		int length = s.length();
		System.out.println(length);
		System.out.println(s.replace("a", "@"));
		String s3="  Java Language  ";
		String trim = s3.trim();
		System.out.println(s3);
		System.out.println(trim);
		
		String s4="Malayalam";
		
		String string = new StringBuilder(s4).reverse().toString();
		System.out.println(string);
		
		if (s4.equalsIgnoreCase(string)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		int[] a11= {35, 27, 35, 45, 45, 50};
		
		Set <Integer> s31=new TreeSet<Integer>();
		
		for(int num:a11) {
			s31.add(num);
		}
		System.out.println("Tress Set : " + s31);
		
		List <Integer> l=new LinkedList<Integer>();
		
		for (int li:a11) {
			l.add(li);
		}
		System.out.println("List : " + l);
		
		
		int s5=128;
		int s6=128;
		System.out.println(s5==s6);
		
		
		Integer s7=128;
		Integer s8=128;
		System.out.println(s7==s8);  // false because integer range -127 to 128 
		System.out.println(s7.equals(s8)); /// true, because checks values alone
		System.out.println(s7*s8);
		
		
		
		int y=4;
		if (y>3){
			 y+=5;    // +=  ----> y+5
			if (y>3) {
				System.out.println(y);
				System.out.println("yepppp");
			}
			else {
				System.out.println(y);
				System.out.println("$%#$");
			}
		}
		
		
		
		int [] nums = {3,8,2,6};
		int j=nums[0]+nums[2];  //3+2=5 j=5
		int k=nums[j%4];       //nums[5%4] k=8
		System.out.println(k);
		
	
		
		int numb=5;
		int result=1;
		while (numb>1) {
			result  *=numb;   // *= ---> result*numb
			numb--;
		}
		System.out.println(result);
		
		int c1=10;
		int c2=20;
		
		c1= c1 ^ c2;
		System.out.println(c1);
		c2= c1 ^ c2;
		System.out.println(c2);
		c1=c1 ^ c2;
		System.out.println(c1);
		System.out.println(c1 +" "+ c2 );
		
		int x1=5;
		int y1= ++x1 * 2 - x1-- ;
		System.out.println(y1);
		

		
		
		}
		
		
		
	}

	

