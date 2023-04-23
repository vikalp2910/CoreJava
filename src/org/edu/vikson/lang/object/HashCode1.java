package org.edu.vikson.lang.object;

public class HashCode1 {
	
	int i;
	
	public HashCode1(int i) {
		this.i = i;
	}


	public static void main(String[] args) {
		
		HashCode1 h1=new HashCode1(10);
		HashCode1 h2=new HashCode1(100);
		
		System.out.println(h1);
		System.out.println(h2);

	}

}
