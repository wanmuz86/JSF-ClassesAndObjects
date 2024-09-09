package com.example.oop;

public class Person {
	
	// Fields  or properties representing a person
	private String name;
	private int age;
	private int height;
	private int weight;
	
	// I want to define two ways of creating the object
	// Either you do not specify anything
	
	public Person() {
		
	}
	
	
	// Or specify everything
	// Declaring a constructor with name, age, height and weight
	
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public void introduce() {
		System.out.println(name +" is "+age+ " years old "
				+ ""+" and height is "+height+ " cm and weight is "
				+weight +" kg");
	}
	
	

}
