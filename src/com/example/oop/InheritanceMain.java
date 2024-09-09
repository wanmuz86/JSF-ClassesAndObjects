package com.example.oop;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal genericAnimal = new Animal();
		Dog dog =  new Dog();
		
		// Dog class is extending Animal, have eats method as well
		genericAnimal.eat();
		dog.eat();
		
		// Method overriding
		genericAnimal.sound();
		dog.sound();
		
		
		// To demonstrate method overloading = 2 methods same name, different parameters
		genericAnimal.move();
		genericAnimal.move(5);
		
		// Normally static method is used on utility classes, eg: Logging
		Animal.sleep(); // Calling static method on the class
		Dog.sleep(); // calling static method on the class
		
		
		Human human = new Human();
		human.run();
		human.swim();
		
		// The Class that is declared here is of type Animal,
		// with polymorphism the instance will be declared as Dog
		// and the sound will be called from the 'dog' sound methid
		Animal myDog = new Dog();
		myDog.sound();
		
		// This will return true
		// We will use  in if else
		System.out.println(myDog instanceof Dog);	
		

	}

}
