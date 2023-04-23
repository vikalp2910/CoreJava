package org.edu.vikson.lang.string;

public class Test04 {

	public static void main(String[] args) {
		
		String s1=new String("vikalp ");
		//s1=>vikalp(Heap) & vikalp(SCP)
		s1.concat("sonkar ");
		//sonkar(SCP) & vikalp sonkar(Heap)
		String s2=s1.concat("vikson ");
		//vikson(SCP) & S2=>vikalp vikson(Heap)
		s1=s1.concat("annie");
		//annie(SCP) & s1=>vikalp annie
		
		System.out.println(s1); //vikalp annie
		System.out.println(s2); //vikalp vikson

	}

}
