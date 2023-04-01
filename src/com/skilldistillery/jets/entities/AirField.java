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
		//populate its fleet from readfromFile method..........
	}
	
	public List<Jet> readFromFile() {
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String aJet;
			  while ((aJet = bufIn.readLine()) != null) {
//			    System.out.println(line);
				  // as you read a jet, add a new jet
				  Jet jet = null;
				  String[] jetDetails = aJet.split(",");
				  String model = jetDetails[1];
				  double speed = Double.parseDouble(jetDetails[2]);
				  int range = Integer.parseInt(jetDetails[3]);
				  long price = Long.parseLong(jetDetails[4]);
				  // create appropriate jet details....
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
				  // if jetDetails[0] is a Fighter jet, create fighter jet
				  // if jetDetails[0] cargo, create cargo jet........
				  // else JetIml type.... 
				  //jetDetails[0] = type
				  getFleet().add(jet);		  
//				  System.out.println(jet);
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		
		// read in various jet types from the file as you read in a jet. 
		///create a jet. add that specific jet type to your jets list.
		
		return fleet;
	}

	public List<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(List<Jet> fleet) {
		this.fleet = fleet;
	
	}


	

}
