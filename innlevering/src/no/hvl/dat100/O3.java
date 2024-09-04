package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Long.*;

public class O3 {
	public static void main(String[] args) {
		boolean validInt = false;
		String nString;
		long n = 0;
		while (!validInt) {
			nString = showInputDialog("Enter an integer greater than 0:");
			n = parseLong(nString);
			
			if (n > 0) {
				validInt = true;
			}
			
			if (!validInt) {
				showMessageDialog(null, "Please enter a valid integer!");
			}
		}
		
		long nFactorial = 1;
		for (long i = n; i >= 1; i--) {
			nFactorial *= i;
		}
		
		showMessageDialog(null, n + "! = " + nFactorial);
	}
}
