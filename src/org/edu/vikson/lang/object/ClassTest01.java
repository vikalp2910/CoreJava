package org.edu.vikson.lang.object;

import java.lang.reflect.Method;

public class ClassTest01 {

	public void m1() {}
	public static void main(String[] args) {
		
		int count=0;
		Object o=new String("vikalp");
		Class c=o.getClass();
		System.out.println(c.getName());
		
		Method[] m=c.getDeclaredMethods();
		
		for(Method m1 : m ) {			
			count++;
			System.out.println(m1.getName());
		}
		
		System.out.println("count = "+count);
	
	}
}
