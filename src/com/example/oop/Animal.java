package com.example.oop;

public class Animal {
	
	void eat() {
		System.out.println("This animal eats food");
	}
	
	void sound() {
		System.out.println("This animal makes a sound");
		}
	
	void move() {
		System.out.println("The animal moves.");
	}
	
	void move(int distance) {
		System.out.println("The animal moves "+distance+ " metres.");
	}
	
	static void sleep() {
		System.out.println("Animal sleeps");
	}
}
