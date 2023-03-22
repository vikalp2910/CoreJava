package org.edu.vikson.constructor;

class Parent4{
	
}

public class Child4 extends Parent4 {
	int i;
	
	public Child4(int i) {
		this.i=i;	
	}

	public static void main(String[] args) {
	
		Child4 c1=new Child4(29);
		System.out.println("main");
		System.out.println("child hash code="+c1.hashCode());
	}

}
