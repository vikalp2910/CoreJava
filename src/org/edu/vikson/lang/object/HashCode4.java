package org.edu.vikson.lang.object;

public class HashCode4 {
	
	private String name ;
	private int rollno;
	
	public HashCode4(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	
	public static void main(String[] args) {
	
		HashCode4 s1=new HashCode4("vikalp",29);
		HashCode4 s2=new HashCode4("anita" ,01);
		HashCode4 s3=new HashCode4("vikalp",29);
		HashCode4 s4=s1;
		
		System.out.println(s1.equals(s2));  //false
		System.out.println(s1.equals(s3));  //false
		System.out.println(s1.equals(s4));  //true

	}

}
