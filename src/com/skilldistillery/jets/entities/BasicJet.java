package com.skilldistillery.jets.entities;

public class BasicJet extends Jet {
	public BasicJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void fly() {
		System.out.println("Basic jet is flying wooooshhhhh.");
		System.out.println(toString());
		System.out.println("This jet can travel for up to " + (this.getRange() / this.getSpeed()) + " hours before running out of fuel. \n");
		
	}

}
