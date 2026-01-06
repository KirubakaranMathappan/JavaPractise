package org.test;

import java.util.Scanner;

public class Stringsss {
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String Value");
	String str = s.nextLine();
	String[] split = str.split("[-_:., ]"); // for multiple split use [ ]
	for (String word:split) {
		System.out.println(word);
	}		

	
	
	// to find min max from string
	
	String s1="I can do java Programm";
		
	String[] wordsplit = s1.split(" ");
	
	String min=wordsplit[0];	
	String max=wordsplit[0];
	
	for(String word:wordsplit) {
		if(word.length()<min.length()) {
			min=word;
		}
		if(word.length()>max.length()) {
			max=word;
		}
	}
	System.out.println(min);
	System.out.println(max);

		
// int min max find	
	int [] a= {2,4,10,14,1,43};
	
	int minnum=a[0];
	int maxnum=a[0];

	
	for(int i=1;i<a.length;i++) {
		if(a[i]<minnum) {
			minnum=a[i];
		}
		if(a[i]>maxnum) {
			maxnum=a[i];
		}
		
	}
	System.out.println(minnum);
	System.out.println(maxnum);
	
	System.out.println();
	
	String str1="Java Programm Language is base";
	
	String[] split2 = str1.split("[ ]");
	
	System.out.println("----each word first character need manual work-----");
		for(int i=0;i<split2.length;i++) {
				//System.out.println(split2[i]); 
			// System.out.println(split2[i].charAt(i));
			 if(i==0) {
				 System.out.println(split2[i].charAt(0));
			 }else if (i==1){
				 System.out.println(split2[i].charAt(0)); 
			 }else if(i==2) {
				 System.out.println(split2[i].charAt(0)); 

			 }
		}
		System.out.println("---each word first character----");
		
		for(String newsplit2:split2) {
			
			System.out.println(newsplit2.charAt(0));
		}
		
		
		
		String str2="welcome";
	
		System.out.println("----------reverse string by stringbuilder---------");
		StringBuffer sb=new StringBuffer(str2);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder stringBuilder = new StringBuilder("java"); 
		stringBuilder.append(str2);
		System.out.println(stringBuilder);
		System.out.println();
		
		System.out.println("-----------reverse array of string-----------");
		String[] str3= {"name","age"};
			
		for(String newstr:str3) {
			StringBuffer sb2=new StringBuffer(newstr);
			sb2.reverse();
			System.out.println(sb2);
		}
		
		System.out.println("-------reverse string by loop---------");
		String strrev = "";
		for(int i=str2.length()-1;i>=0;i--) {
			strrev=strrev+str2.charAt(i);
		}
		System.out.println(strrev);
	
	}
	
}
