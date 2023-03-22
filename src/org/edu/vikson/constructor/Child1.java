package org.edu.vikson.constructor;

 class Parent1{
	
	int age;
	String name ;
	
	public Parent1(int age ,String name) {
		super();
		this.age = age;
		this.name = name;
	    System.out.println("Parent Constructor AGE="+age+" && NAME="+name);
	}
	
	
}

 public class Child1 extends Parent1 {

	int roll;
	String marks;
	
	

	public Child1(int age, String name, int roll, String marks) {
	    super(age, name);
		this.roll = roll;
		this.marks = marks;
		System.out.println("Child Constructor ROLL="+roll+" && MARKS="+marks);	
	}

	public static void main(String[] args) {
		
		System.out.println("======Start======");
		Child1 c1=new Child1(29, "vikalp", 2910, "90");
		System.out.println("======End======");

	}

}
