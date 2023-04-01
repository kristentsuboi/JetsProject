package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();

	}

	public void launch() {
		// create airfield
		AirField af = new AirField();
		List<Jet> fleetList = new ArrayList<>();
		fleetList = af.getFleet();
//		Jet jet = null;
		
		
		int option = 0;
		while (option != 9) {
			System.out.println("*** MENU ***");
			System.out.println("1. List fleet.");
			System.out.println("2. Fly all jets.");
			System.out.println("3. View the fastest jet.");
			System.out.println("4. View jet with longest range.");
			System.out.println("5. Load all cargo jets.");
			System.out.println("6. Fighter jets... FIGHT!");
			System.out.println("7. Add a jet to the fleet.");
			System.out.println("8. Remove a jet from the fleet.");
			System.out.println("9. Quit.");
			System.out.println("Please select from option 1-9: ");
			option = sc.nextInt();
			if (option == 1) {
				for (Jet j: fleetList) {
					System.out.println(j);
				}
					continue;
			} else if (option == 2) {
				for (Jet j: fleetList) {
					j.fly();
				}
				continue;
			} else if (option == 3) {
				// view fastest jet
//				for (Jet j: fleetList) {
//					if (j.getSpeed() > Jet.getSpeed()) {
//						
//					}
//				}
				continue;
			} else if (option == 4) {
				// view jet with longest range
				continue;
			} else if (option == 5) {
				// load cargo jets.
			
				continue;
			} else if (option == 6) {
				// fight fighter jets
				continue;
			} else if (option == 7) {
				// add a jet
				continue;
			} else if (option == 8) {
				// remove a jet
				continue;
			} else if (option == 9) {
				System.out.println("You are exiting the program. Goodbye!");
				break;
			} else {
				System.out.println("***PLEASE ENTER A VALID RESPONSE: \n ");
			}
		}
	
	


	}}

