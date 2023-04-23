package org.edu.vikson.lang.object;

import java.util.Objects;

public class HashCode5 {
	
	private String name ;
	private int rollno;
	
	public HashCode5(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCode5 other = (HashCode5) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}

	public static void main(String[] args) {
	
		HashCode5 s1=new HashCode5("vikalp",29);
		HashCode5 s2=new HashCode5("anita" ,01);
		HashCode5 s3=new HashCode5("vikalp",29);
		HashCode5 s4=s1;
		
		System.out.println(s1.equals(s2));  //false
		System.out.println(s1.equals(s3));  //true
		System.out.println(s1.equals(s4));  //true
		System.out.println(s1.equals("v")); //false
		System.out.println(s1.equals(null));//false
	}

}

