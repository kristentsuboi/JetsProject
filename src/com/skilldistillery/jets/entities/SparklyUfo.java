package com.skilldistillery.jets.entities;

public class SparklyUfo extends Jet{

	public SparklyUfo(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void fly() {
		System.out.println("Sparkly UFO flying. Boooo aliens.");
		System.out.println(toString());
		System.out.println("This jet can travel for up to " + (this.getRange() / this.getSpeed()) + " hours before running out of fuel. \n");
		
	}
	

}
