package org.edu.vikson.lang.string;

public class Test02 {

	public static void main(String[] args) {
		String s1=new String("vikalp ");  //s1=>vikalp
		s1.concat("sonkar");  //sonkar ,  vikalp sonakr 
		System.out.println(s1);  //vikalp
		
		StringBuffer sb1=new StringBuffer("vikalp ");  //sb1=>vikalp
		sb1.append("sonkar");  //sb1=>vikalp sonkar
		System.out.println(sb1); //vikalp sonkar
		
		

	}

}
