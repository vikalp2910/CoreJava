package org.edu.vikson.lang.object;

public class HashCode3 {
int i;
	
	public HashCode3(int i) {
		this.i = i;
	}
	
	public int hashCode() {
	   return i;
	}
	
	@Override
	public String toString() {
		return "HashCode3 [i=" + i + "]";
	}

	public static void main(String[] args) {
		
		HashCode3 h1=new HashCode3(10);
		HashCode3 h2=new HashCode3(100);
		HashCode3 h3=new HashCode3(101);
		
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

	}

}