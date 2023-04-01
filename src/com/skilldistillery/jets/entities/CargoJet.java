package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	public void loadCargo() {
		System.out.println("Loading cargo for transport........");
	}

	@Override
	public void fly() {
		System.out.println("Cargo jet flying the cargo. vurrummmmmm");
		
	}
	
	
	
	
	
}
