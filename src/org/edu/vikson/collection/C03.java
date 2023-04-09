package org.edu.vikson.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s1=new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		
		while(itr.hasNext()) {
			
			var v=itr.next();
			System.out.println(v);
		}
		

	}

}
