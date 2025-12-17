package org.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Practise1 {
	
	public static void main(String[] args) {
		
		int numb=5;
		int result=1;
		while (numb>1) {
			result  *=numb;
			numb--;
		}
		System.out.println(result);
		
		
		String s="Palladam", s1="Wow";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.append(" "+s1));
		System.out.println(sb);
		
	System.out.println("---------------Stream---------------------------");	
		System.out.println();
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
			
		List<Integer> evennum = numbers.stream()
								.filter(n-> n%2 == 0)
								.collect(Collectors.toList());
		System.out.println("Even Numbers : " +evennum);
		
		List<Integer> oddnum = numbers.stream().filter(n-> n%2!=0).collect(Collectors.toList());
		System.out.println("Odd Numbers  : "+oddnum);
		
			
				
		System.out.println();
			
	System.out.println("-------------Array to find Even or Odd------------------");	
		int [] a= {10,12,13,14,15,36,57,58,49};
				
		for(int x:a) {
			if(x%2==0) {
				System.out.println(x +" "+" is EvenNumber");
			}
			else if(x%2!=0) {
				System.out.println(x+ " "+" is OddNumber");
			}
		}
		
		
		List<Integer> num = Arrays.asList(1,1,4,3,2,1,4,6,7,5,4,3,2);
		
		Set<Integer> uniquenum=new TreeSet<>(num);
		System.out.println(uniquenum);
		
		List<Integer> newnum=num.stream().distinct().collect(Collectors.toList());		
		System.out.println(newnum);
		
		
		int[] x= {1,2,2,2,4,5,3,3,7,1,2,5};
		Set<Integer> newx=new TreeSet<Integer>();
		for (int xy:x) {
			newx.add(xy);
		}
		System.out.println(newx);
			

		
		int [] n= {69,50,50,21,35,35,47,47,56,68};
		
		Set <Integer> sett=new TreeSet<>();
		for(int stv:n) {
			sett.add(stv);
		}
		System.out.println(sett);
		
		double na=0.1 + 0.2;
		double nan=0.4 - 0.1;
		double an=0.3;
		double xy=0.3;
		System.out.println(na==nan);
		System.out.println(an==nan);
		System.out.println(an==xy);
		
		int x1=5;
		
		while (x1>2) {
			x1 -=2;
		}
		System.out.println(x1);
		
		
		
	}

}
