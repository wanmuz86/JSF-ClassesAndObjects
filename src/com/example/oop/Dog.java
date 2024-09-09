package com.example.oop;


public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("This dog is making a sound");
	}
	
	// For static methods there is no override term
	// You don't need the annotation override here
	// The method from parent class will be hidden
	static void sleep() {
		System.out.println("Dog  sleeps");
	}

}
