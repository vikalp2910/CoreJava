package org.edu.vikson.lang.string;

public final class Test10 {

	 private int i;
	 
	 
	private Test10(int i) {
		this.i = i;
	}
	
	public Test10 modify(int i) {
		if(this.i==i) 
			return this;
		else
			return new Test10(i);
	}


	public static void main(String[] args) {
		Test10 t1=new Test10(10);
		Test10 t2=t1.modify(100);
		Test10 t3=t1.modify(10);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());		
	}
}
