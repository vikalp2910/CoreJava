package org.edu.vikson.lang.string;

public class Test08 {

	public static void main(String[] args) {
		
		String s1="vikalp";  
		//s1=>vikalp (SCP)
		String s2=s1.toString();
		//s2=>vikalp no Object created 
		System.out.println(s1==s2); //true
		
		String s3=s1.toLowerCase();
		//s3=>vikalp no Object created there is no change in content
		System.out.println(s1==s3); //true
		
		String s4=s1.toUpperCase();
		//s4=>VIKALP(Heap)
		System.out.println(s4==s1);//false
	
		String s5=s4.toLowerCase();
		//s5=vikalp(Heap)
		System.out.println(s5==s4);//false

	}

}
