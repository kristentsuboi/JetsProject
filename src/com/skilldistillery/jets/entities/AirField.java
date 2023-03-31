package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet;
	
	
	public AirField() {
		//populate its fleet from readfromFile method..........
	}
	
	public List<Jet> readFromFile() {
		List<Jet> jets = new ArrayList<>();
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String aJet;
			  while ((aJet = bufIn.readLine()) != null) {
//			    System.out.println(line);
				  // as you read a jet, add a new jet
				  String[] jetDetails = aJet.split(",");
				  // create appropriate jet details....
				  // if jetDetails[0] is a Fighter jet, create fighter jet
				  // if jetDetails[0] cargo, create cargo jet........
				  // else JetIml type.... 
				  //jetDetails[0] = type
						  
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		
		// read in various jet types from the file as you read in a jet. 
		///create a jet. add that specific jet type to your jets list.
		
		return jets;
	}

}
