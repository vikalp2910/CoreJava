package org.edu.vikson.constructor;

class Parent2{
	
	Parent2(){
		System.out.println("parent hash code ="+this.hashCode());
	}
	
}

public class Child2 extends Parent2 {
	
	 Child2() {
		System.out.println("child has code  ="+this.hashCode());
	}

	public static void main(String[] args) {
	
		Child2 c1=new Child2();
		System.out.println(c1.hashCode());
		
		System.out.println("==================");
		Parent2 p1=new Parent2();
		

	}

}
