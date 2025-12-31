package org.test;

import java.util.Scanner;

public class Stringsss {
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String Value");
	String str = s.nextLine();
	String[] split = str.split("[-_: ]"); // for multiple split use [ ]
	for (String word:split) {
		System.out.println(word);
	}		
}

}
