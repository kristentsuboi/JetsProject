package com.skilldistillery.jets.entities;

public class FlyingYacht extends Jet {
	
	public FlyingYacht(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void fly() {
		System.out.println("Yacht is flying, are pigs coming next?");
		
	}


}

