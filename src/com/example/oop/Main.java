package com.example.oop;

public class Main {

	public static void main(String[] args) {
	
		// Create an instance of the Person class
		// (Class) (identifier) = new (Constructor)
		Person person1 = new Person(); 
		
		// Specify the value of the property
		person1.setName("Muzaffar");
		person1.setAge(38);
		person1.setHeight(170);
		person1.setWeight(70);
		
		
//		System.out.println(person1.name +" is "+person1.age+ " years old "
//				+ ""+" and height is "+person1.height+ " cm and weight is "
//				+person1.weight +" kg");
		
		// Invoke or call the method created
		
		person1.introduce();
		
		
		Person person2 = new Person("John Doe", 30, 170, 60);
//		System.out.println(person2.name +" is "+person2.age+ " years old "
//				+ ""+" and height is "+person2.height+ " cm and weight is "
//				+person2.weight +" kg");
		
		person2.introduce();
		
		
		Person person3 = new Person();
		System.out.println("Default name: "+person3.getName());
		System.out.println("Default age: "+person3.getAge());
		System.out.println("Default height: "+person3.getHeight());
		System.out.println("Default weight: "+person3.getWeight());

}
}
