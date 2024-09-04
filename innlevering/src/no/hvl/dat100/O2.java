package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			boolean validGrade = false;
			String scoreString;
			while (!validGrade) {
				scoreString = showInputDialog("Enter Score:");
				int score = parseInt(scoreString);
				
				validGrade = true;
				
				if (score < 0 || score > 100) {
					validGrade = false;
					showMessageDialog(null, "Please enter a valid grade (0-100)");
				} else if (score < 40) {
					showMessageDialog(null, "Grade: F");
				} else if (score < 50) {
					showMessageDialog(null, "Grade: E");
				} else if (score < 60) {
					showMessageDialog(null, "Grade: D");
				} else if (score < 80) {
					showMessageDialog(null, "Grade: C");
				} else if (score < 90) {
					showMessageDialog(null, "Grade: B");
				} else {
					showMessageDialog(null, "Grade: A"); // Since I ruled out anything over 100, just `else` is needed here
				}
			}
		}
	}
}
