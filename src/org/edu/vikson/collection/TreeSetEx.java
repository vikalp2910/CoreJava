package org.edu.vikson.collection;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t1=new TreeSet();
		t1.add(20);
		t1.add(10);
		t1.add(30);
		t1.add(50);
		t1.add(40);
		
		System.out.println(t1);
		
		System.out.println(t1.first());
		System.out.println(t1.last());
		
		System.out.println(t1.headSet(30));
		System.out.println(t1.tailSet(30));


	}

}
