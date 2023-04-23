package org.edu.vikson.lang.string;

public class Test06 {

	public static void main(String[] args) {
		
		String s="vikalp";
		System.out.println(s.charAt(0));
		
		char[] c=s.toCharArray();
		for(char  c1 :c) {
			System.out.print(c1);
		}
		
		System.out.println();
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(1));
		
		System.out.println(s.substring(1));
		System.out.println(s.substring(1, 4));
		
		System.out.println(s.length());
		System.out.println(s.replace('v', 'p'));
		System.out.println(s.repeat(2));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String s1=" son kar   ";
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		
		String s2="annie";
		System.out.println(s2.indexOf('n'));
		System.out.println(s2.indexOf('v'));
		System.out.println(s2.lastIndexOf('n'));
		
	}

}
