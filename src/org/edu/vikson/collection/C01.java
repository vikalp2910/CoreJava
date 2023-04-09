package org.edu.vikson.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1=Arrays.asList(10,1,2,3,4,5,6);
		List<Integer> list2=List.of(10,20,30,40,50);
		
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		list2=list2.subList(1, 3);
		System.out.println(list2);
		
		System.out.println(list2.size());
				
		
		
		

	}

}
