package org.edu.vikson.lang.object;

import java.util.Objects;

public class HashCode6 {

private String name ;
private int rollno;

public HashCode6(String name, int rollno) {
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

	try {
	String name1=this.name;
	int rollno1=this.rollno;
	
//	System.out.println("name1" +name1);
	
	HashCode6 h=(HashCode6)obj;
	String name2=h.name;
	int rollno2=h.rollno;
	
//  System.out.println("name2" +name2);
	
	if(name1.equals(name2) && rollno1==rollno2) {
		return true;
	}
	return false;
   }
	catch (ClassCastException e) {
		return false;
	}
	catch (NullPointerException e) {
		return false;
	}
	catch (Exception e) {
		return false;
	}
 }

public static void main(String[] args) {

	HashCode6 s1=new HashCode6("vikalp",29);
	HashCode6 s2=new HashCode6("anita" ,01);
	HashCode6 s3=new HashCode6("vikalp",29);
	HashCode6 s4=s1;
	
	System.out.println(s1.equals(s2));  //false
	System.out.println(s1.equals(s3));  //true
	System.out.println(s1.equals(s4));  //true
	System.out.println(s1.equals("v")); //false
	System.out.println(s1.equals(null));//false
	
   } 
 }

