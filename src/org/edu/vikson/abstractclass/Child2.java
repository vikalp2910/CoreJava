package org.edu.vikson.abstractclass;

public class Child2 extends Parent1{
	
	double salary;
	String subject;

	public Child2(int age , String name , double salary , String subject) {
		super(age,name);
//		this.age=age;
//		this.name=name;
		this.salary=salary;
		this.subject=subject;
		
	}

	public static void main(String[] args) {
		
		Child2 c1=new Child2(29, "vikson", 100000, "Java");

	}

}
