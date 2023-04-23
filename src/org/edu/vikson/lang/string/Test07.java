package org.edu.vikson.lang.string;

public class Test07 {

	public static void main(String[] args) {
		
		String s1=new String("vikalp"); 
		//s1=>vikalp(Heap) & vikalp(SCP)
		String s2=s1.toUpperCase();
		//s2=>VIKALP(Heap) because of runtime operation
		String s3=s1.toLowerCase();
		//s3=>vikalp no Object created since there is no change in content.
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //true
		
		String s4=s2.toLowerCase();
		//s4=>vikalp(Heap) content of s2 change to lower case object will be created
		System.out.println(s2==s4); //fals
		
		String s5=s4.toUpperCase();
		//s5=>VIKALP(Heap) content of s4 is cahnge to upper case Obeject will be created
		System.out.println(s5==s4);//false	

	}

}
