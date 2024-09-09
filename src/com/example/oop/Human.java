package com.example.oop;

// Multiple implementation/ interfaces
// As I m declaring that I am implementing Runner and Swimmer
// An error comes out, asking me to fulfill the contract
// to implement, run and swim method
public class Human implements Runner,Swimmer{

	@Override
	public void swim() {
		System.out.println("Human is swimming");
		
	}

	@Override
	public void run() {
		System.out.println("Human is running");
		
	}

}
