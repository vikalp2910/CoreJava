package org.edu.vikson.abstractclass;

abstract class Parent1{
	int age;
	String name;
	public Parent1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
}

public class Child1 extends Parent1 {

	int roll;
	String marks;
	
	

	public Child1(int age,String name,int roll, String marks) {
		
		super(age,name);
//		this.age=age;
//		this.name=name;
		this.roll = roll;
		this.marks = marks;
	}



	public static void main(String[] args) {
	
		Child1 c1=new Child1(29, "vikson", 2910, "95");

		
	}

}
