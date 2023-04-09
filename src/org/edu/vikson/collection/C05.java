package org.edu.vikson.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class C05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // ArrayList<Integer> list = new ArrayList<>();  
		  CopyOnWriteArrayList<Integer>list =new CopyOnWriteArrayList<>();
		  
	        list.add(1);  
	        list.add(2);  
	        list.add(3);  
	        list.add(4);  
	        list.add(5);  
	  
	        Iterator<Integer> it = list.iterator();  
	        while (it.hasNext()) {                   
	Integer value = it.next();              
	            System.out.println("List Value:" + value);  
	            if (value.equals(3))  
	                list.remove(value);  
	        }  
	  
	    }  

	}


