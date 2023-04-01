package com.skilldistillery.jets.app;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.BasicJet;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.FlyingYacht;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.SparklyUfo;

public class JetsApplication {
	Scanner sc = new Scanner(System.in);
	AirField af = new AirField();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();

	}

	public void launch() {
		int option = 0;
		while (option != 9) {
			menu();
			option = sc.nextInt();
			if (option == 1) {
				listJets();
			} else if (option == 2) {
				flyJets();
			} else if (option == 3) {
				fastestJet();
			} else if (option == 4) {
				longestRange();
				continue;
			} else if (option == 5) {
				loadCargoJets();
			} else if (option == 6) {
				fightFighters();
			} else if (option == 7) {
				addJet();
			} else if (option == 8) {
				removeJet();
			} else if (option == 9) {
				System.out.println("You are exiting the program. Goodbye!");
				sc.close();
				break;
			} else {
				System.out.println("***PLEASE ENTER A VALID RESPONSE: \n ");
			}
		}
	}

	public void menu() {
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
	}

	public void listJets() {
		for (Jet j : af.getFleet()) {
			System.out.println(j);
		}
	}

	public void flyJets() {
		for (Jet j : af.getFleet()) {
			j.fly();

		}
	}

	public void fastestJet() {
		Jet fastest = null;
		for (Jet j : af.getFleet()) {
			if (fastest == null) {
				fastest = j;
			} else if (j.getSpeed() > fastest.getSpeed()) {
				fastest = j;
			}
		}
		System.out.println("The fastest jet is: \n" + fastest + "\n");
	}

	public void longestRange() {
		Jet longest = null;
		for (Jet j : af.getFleet()) {
			if (longest == null) {
				longest = j;
			} else if (j.getRange() > longest.getRange()) {
				longest = j;
			}
		}
		System.out.println("The jet with the longest range is: \n" + longest + "\n");
	}

	public void loadCargoJets() {
		for (Jet j : af.getFleet()) {
			if (j instanceof CargoJet) {
				((CargoJet) j).loadCargo();
			}
		}
	}
	
	public void fightFighters() {
		for (Jet j : af.getFleet()) {
			if (j instanceof FighterJet) {
				((FighterJet) j).fight();
			}
		}
	}

	public void removeJet() {
		List<Jet> jets = af.getFleet();
		for (int i = 0; i < jets.size(); i++) {
			System.out.println((i + 1 + ". " + jets.get(i)));
		}
		System.out.println("Please select the index of the jet you would like to delete: ");
		try {
			int removalChoice = sc.nextInt();
			if (removalChoice < jets.size() + 1 && removalChoice > 0) {
				System.out.println(jets.get(removalChoice - 1).getModel() + " has been deleted...");
				jets.remove(removalChoice - 1);
			} else {
				System.out.println("Not a valid response.");
			}
		} catch (InputMismatchException o) {
			System.err.println(o.getMessage());
		}
	}

	public void addJet() {
		try {
			System.out.println("What type of jet would you like to add? ");
			System.out.println("1. CargoJet");
			System.out.println("2. FighterJet");
			System.out.println("3. BasicJet");
			System.out.println("4. SparklyUFO");
			System.out.println("5. FlyingYacht");
			System.out.println("Please make a choice 1 - 5: ");
			int addChoice = sc.nextInt();
			System.out.println("Please enter a model: ");
			sc.nextLine();
			String model = sc.nextLine();
			System.out.println("Please enter a speed: ");
			Double speed = sc.nextDouble();
			System.out.println("Please enter a range: ");
			int range = sc.nextInt();
			System.out.println("Please enter a price: ");
			long price = sc.nextLong();
			if (addChoice == 1) {
				af.getFleet().add(new CargoJet(model, speed, range, price));
			}
			if (addChoice == 2) {
				af.getFleet().add(new FighterJet(model, speed, range, price));
			}
			if (addChoice == 3) {
				af.getFleet().add(new BasicJet(model, speed, range, price));
			}
			if (addChoice == 4) {
				af.getFleet().add(new SparklyUfo(model, speed, range, price));
			}
			if (addChoice == 5) {
				af.getFleet().add(new FlyingYacht(model, speed, range, price));
			}
			System.out.println("Jet has been added...");
		} catch (InputMismatchException o) {
			System.out.println("Invalid input.");
			System.out.println(o.getMessage());
		}
	}
}
