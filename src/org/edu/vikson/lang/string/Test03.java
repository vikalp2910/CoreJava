package org.edu.vikson.lang.string;

public class Test03 {

	public static void main(String[] args) {
		String s1=new String("vikalp"); //s1=>vikalp(heap) | vikalp(SCP) 
		String s2=new String("vikalp"); //s2=>vikalp(heap)
		String s3="vikalp";//s3=>vikalp(SCP) no object as SCP object is present 
		String s4="vikalp";//s4=>vikalp(SCP)  no object as SCP object is present
		
	}

}
