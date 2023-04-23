package org.edu.vikson.lang.string;

public class Test05 {

	public static void main(String[] args) {
		
		String s1=new String("Spring");
		//s1=>Spring(Heap) & Spring(SCP)
		s1.concat("Summer");
		//summer(SCP) & SpringSummer(Heap)
		String s2=s1.concat("Winter");
		//Winter(SCP) & s2=>SpringWninter
		s1=s1.concat("Fall");
		//Fall(SCP) & s1=>SpringFall
		
		System.out.println(s1);  //SpringFall
		System.out.println(s2);  //SpringWinter

	}

}
