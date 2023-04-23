package org.edu.vikson.lang.object;

import java.util.Objects;

public class HashCode7 {

private String name ;
private int rollno;

public HashCode7(String name, int rollno) {
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

	if(obj==this)
		return true;
	
	if (obj instanceof HashCode7) {
		
	HashCode7 h=(HashCode7)obj;
	String name2=h.name;
	int rollno2=h.rollno;
	
	if(name.equals(name2) && rollno==rollno2) {
		return true;
	}
	return false;
	}
	else
		return false;
   }

public static void main(String[] args) {

	HashCode7 s1=new HashCode7("vikalp",29);
	HashCode7 s2=new HashCode7("anita" ,01);
	HashCode7 s3=new HashCode7("vikalp",29);
	HashCode7 s4=s1;
	
	System.out.println(s1.equals(s2));  //false
	System.out.println(s1.equals(s3));  //true
	System.out.println(s1.equals(s4));  //true
	System.out.println(s1.equals("v")); //false
	System.out.println(s1.equals(null));//false
	
   } 
 }