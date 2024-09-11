package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		// variable declaration
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount");	
		double startAmount = in.nextDouble();
		System.out.println("Enter win chance");
		double winChance = in.nextDouble();
		System.out.println("Enter Win limit");
		double winLimit = in.nextDouble();
		System.out.println("Enter number of simulations");
		int simNumber = in.nextInt();
		int numPlays = 0;

		// Loopy
		for (int i = 0; i < simNumber; i++) {
			while((startAmount < winLimit) && (startAmount > 0)) {
				if ( Math.random() <= winChance) {
					startAmount++;
					numPlays++;
				}
				else {
					startAmount--;
					numPlays++;
				}
			}
			if (startAmount >= winLimit) {
				System.out.println("Simulation "+ simNumber + ": " + numPlays + " WIN");
			}
			else {
				System.out.println("Simulation "+ simNumber + ": " + numPlays + " LOSS");
			}
		}
	}

}
