package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String bob = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		double n1 = Double.parseDouble(bob);
		// Ask the user how many dimes they have, and convert their answer
		String hi = JOptionPane.showInputDialog("How many dimes you have?");
		double n2 = Double.parseDouble(hi);
		// Ask the user how many quarters they have, and convert their answer
		String jeff = JOptionPane.showInputDialog("How many quarters you have?");
		double n3 = Double.parseDouble(jeff);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double total = n1 * 5/ 100;
		double total2 = n2 * 10/ 100;
		double total3 = n3 * 25/ 100;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, total+total2+total3);
	}
}

