package org.edu.vikson.lang.object;

public class HashCode2 {
int i;
	
	public HashCode2(int i) {
		this.i = i;
	}
	
	public int hashCode() {
	   return i;
	}

	public static void main(String[] args) {
		
		HashCode2 h1=new HashCode2(10);
		HashCode2 h2=new HashCode2(100);
		HashCode2 h3=new HashCode2(101);
		
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

	}

}