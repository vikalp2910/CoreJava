package org.edu.vikson.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1=new ArrayList<>();
		ArrayList l2=new ArrayList<>();
		
		l1.add(10);
		l1.add("anita");
		l1.add(null);
		l1.add(null);
		l1.add(10);
		l1.add(null);
		
		
	    System.out.println(l1);
	    //System.out.println(l1.size());
	    
	  
	    
        Iterator itr=l1.iterator();
		
		while(itr.hasNext()) {
			
			var v=itr.next();
			System.out.println(v);
		}
		

	}

}
