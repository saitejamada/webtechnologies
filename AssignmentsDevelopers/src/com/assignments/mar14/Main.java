package com.assignments.mar14;

public class Main {

	public static void main(String[] args) {
		
		//Vechile v=new Vechile();
		
		Vechile b=(Vechile) new Bike();
		b.engineCC();
		b.topSpeed();
		b.print();
		
		Vechile c=new Car();
		c.engineCC();
		c.topSpeed();
	}
}
