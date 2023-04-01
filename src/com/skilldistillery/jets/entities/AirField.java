package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet = new ArrayList<>();
	
	
	public AirField() {
		readFromFile();
	}
	
	public List<Jet> readFromFile() {
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String aJet;
			  while ((aJet = bufIn.readLine()) != null) {
				  Jet jet = null;
				  String[] jetDetails = aJet.split(",");
				  String model = jetDetails[1];
				  double speed = Double.parseDouble(jetDetails[2]);
				  int range = Integer.parseInt(jetDetails[3]);
				  long price = Long.parseLong(jetDetails[4]);
				  if (jetDetails[0].equals("CargoJet")) {
					 jet = new CargoJet(model, speed, range, price);
				  }
				  if (jetDetails[0].equals("FighterJet")) {
					  jet = new FighterJet(model, speed, range, price);
				  }
				  if (jetDetails[0].equals("SparklyUfo")) {
					  jet = new SparklyUfo(model, speed, range, price);
				  }
				  if (jetDetails[0].equals("FlyingYacht")) {
					  jet = new FlyingYacht(model, speed, range, price);
				  }
				  if (jetDetails[0].equals("BasicJet")) {
					  jet = new BasicJet(model, speed, range, price);
				  }
				  getFleet().add(jet);		  
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}	
		return fleet;
	}

	public List<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(List<Jet> fleet) {
		this.fleet = fleet;
	
	}


	

}
