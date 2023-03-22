package org.edu.vikson.constructor;

class Parent3{
	
	int i;
	

	public Parent3(int i) {
		super();
		this.i=i;
		
	}
	
}

public class Child3 extends Parent3 {
	
	

	public Child3(int i) {
		super(i);
	}

	public static void main(String[] args) {
	
		Child3 c1=new Child3(29);
		System.out.println("main");
		System.out.println("child hash code="+c1.hashCode());
	}

}
