package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {
	public static void main(String[] args) {
		String grossWageString = showInputDialog("Enter Gross Wage:");
		int grossWage = parseInt(grossWageString);
		double bracket; 
		long bracketTax;
		
		if (grossWage <= 208_050) {
			bracket = 0.0;
		} else if (grossWage <= 292_850) {
			bracket = 0.017;
		} else if (grossWage <= 670_000) {
			bracket = 0.04;
		} else if (grossWage <= 937_900) {
			bracket = 0.136;
		} else if (grossWage <= 1_350_000) {
			bracket = 0.166;
		} else {
			bracket = 0.176;
		}
		
		bracketTax = Math.round(grossWage * bracket);
		
		showMessageDialog(null, "Your total bracket tax is: " + bracketTax);
	}
}
