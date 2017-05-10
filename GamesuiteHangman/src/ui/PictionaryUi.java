package ui;

import domain.*;
import javax.swing.JOptionPane;

public class PictionaryUi {
	private Speler speler;
	private boolean bezig=true;

	public PictionaryUi(Speler speler) {
		this.speler = speler;
	}

	public void showMenu() {
		String naamTekening = JOptionPane.showInputDialog("Wat is de naam van de tekening?");
		Tekening tekening = new Tekening(naamTekening);

		int x = Integer.parseInt(JOptionPane.showInputDialog("X coördinaat van het punt: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Y coördinaat van het punt: "));

		Punt p = new Punt(x, y);
		JOptionPane.showConfirmDialog(null, "U heeft een correct punt aangemaakt: " + p.toString());

		while (bezig) {
			int keuze1 = Integer.parseInt(JOptionPane
					.showInputDialog("Wat wil je doen: \n \n 1.Vorm maken \n 2. Tekening tonen \n \n 0. Stoppen"));

			if (keuze1 == 0) {
				bezig=false;
			} 
			else if (keuze1 == 1) {
				Object[] shapes = { "Cirkel", "Rechthoek", "Driehoek" };

				Object keuze2 = JOptionPane.showInputDialog(null, "Wat wilt u tekenen?", "input",
						JOptionPane.INFORMATION_MESSAGE, null, shapes, null);

				if (keuze2.equals("Cirkel")) {
					int straal = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel:"));
					Cirkel cirkel = new Cirkel(p, straal);
					JOptionPane.showConfirmDialog(null,
							"U heeft een correct cirkel aangemaakt: Cirkel: middelPunt" + p + " - Straal  - " + straal);
					tekening.voegToe(cirkel);
				} 
				else if (keuze2.equals("Rechthoek")) {
					int breedte = Integer.parseInt(JOptionPane.showInputDialog("Breedte van de rechthoek: "));
					int hoogte = Integer.parseInt(JOptionPane.showInputDialog("Hoogte van de rechthoek: "));
					Rechthoek rechthoek = new Rechthoek(p, breedte, hoogte);
					JOptionPane.showConfirmDialog(null, "Uw heeft een correcte rechthoek aangemaakt: " + rechthoek);
					tekening.voegToe(rechthoek);
				} 
				else if (keuze2.equals("Driehoek")) {
					int x2 = Integer.parseInt(JOptionPane.showInputDialog("X coördinaat van het tweede punt: "));
					int y2 = Integer.parseInt(JOptionPane.showInputDialog("Y coördinaat van het tweede punt: "));

					Punt p2 = new Punt(x2, y2);
					JOptionPane.showConfirmDialog(null, "U heeft een correct punt aangemaakt: " + p2.toString());

					int x3 = Integer.parseInt(JOptionPane.showInputDialog("X coördinaat van het derde punt: "));
					int y3 = Integer.parseInt(JOptionPane.showInputDialog("Y coördinaat van het derde punt: "));

					Punt p3 = new Punt(x3, y3);
					JOptionPane.showConfirmDialog(null, "U heeft een correct punt aangemaakt: " + p3.toString());

					Driehoek d = new Driehoek(p, p2, p3);
					JOptionPane.showConfirmDialog(null, "Uw heeft een correcte driehoek aangemaakt: " + d);
					tekening.voegToe(d);
				}
			} 
			else if (keuze1 == 2) {
				JOptionPane.showConfirmDialog(null, tekening.toString());
			}

		}
	}

}
