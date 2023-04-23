package org.edu.vikson.lang.string;

public class Test01 {

	public static void main(String[] args) {
		
		String s1=new String("vikalp");
		String s2=new String("vikalp");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));  //true
		
		StringBuffer sb1=new StringBuffer("vikalp");
		StringBuffer sb2=new StringBuffer("vikalp");
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false
		
		System.out.println(sb1.toString().equals(sb2.toString())); //true
		
	}

}
