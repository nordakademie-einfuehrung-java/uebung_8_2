package uebung_8_2;

import java.util.Random;
import javax.swing.*;

public class Zahlenraten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random zufall = new Random();
		int number;
		switch (number = zufall.nextInt(100)) {
		case 0:
			number = zufall.nextInt(100);
		}
		int versuch;
		for (int i = 1; i <= 1000; i++) {

			versuch = Integer
					.parseInt(JOptionPane
							.showInputDialog("Erraten Sie ein ganzzahlige Zahl zwischen 1 und 100. Bitte geben Sie ihre Zahl ein:"));
			if (versuch > 100) {
				JOptionPane
						.showMessageDialog(null,
								"Bitte geben sie eine ganzzahlige Zahl im Zahlenbereich von 1 und 100 ein.");
			}

			else if (versuch == number) {
				JOptionPane.showMessageDialog(null,
						"Herrvorragend, Sie haben die Zahl " + number
								+ " nach nur " + i + " Versuchen gefunden.");
				i = 1000;
			} else if (versuch <= number) {
				JOptionPane
						.showMessageDialog(null,
								"Die gesuchte Zahl ist größer. Bitte versuchen Sie es erneut");
			} else if (versuch >= number) {
				JOptionPane
						.showMessageDialog(null,
								"Die gesuchte Zahl ist kleiner. Bitte versuchen Sie es erneut");
			}

		}

	}

}
