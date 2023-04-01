package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements Combat{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	
	public void fight() {
		System.out.println("Pewwww pewww pew... fighting bad guys......... and winning!");
	}

	@Override
	public void fly() {
		System.out.println("Fighter jet in route..........");
		
	}

}
