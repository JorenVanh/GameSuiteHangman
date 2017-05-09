package ui;

import domain.*;
import javax.swing.JOptionPane;

public class PictionaryUi {
	private Speler speler ;
	
	public PictionaryUi(Speler speler){
		this.speler = speler;
	}
	
	public void showMenu(){
		int x = Integer.parseInt(JOptionPane.showInputDialog("X coördinaat van het punt: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Y coördinaat van het punt: "));
		
		Punt p = new Punt(x,y);
		JOptionPane.showConfirmDialog(null,"U heeft een correct punt aangemaakt: " + p.toString());
		
		Object[] shapes = { "Cirkel", "Rechthoek"};

		Object keuze = JOptionPane.showInputDialog(null, "Wat wilt u tekenen?", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
		
		if (keuze.equals("Cirkel")){
			int straal = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel:"));
			Cirkel cirkel = new Cirkel(p, straal);
			JOptionPane.showConfirmDialog(null, "U heeft een correct cirkel aangemaakt: Cirkel: middelPunt" + p + " - Straal  - " + straal);
		} else if(keuze.equals("Rechthoek")) {
			int breedte = Integer.parseInt(JOptionPane.showInputDialog("Breedte van de rechthoek: "));
			int hoogte = Integer.parseInt(JOptionPane.showInputDialog("Hoogte van de rechthoek: "));
			Rechthoek rechthoek = new Rechthoek(p, breedte, hoogte);
			JOptionPane.showConfirmDialog(null, "Uw heeft een correcte rechthoek aangemaakt: " + rechthoek);
		}
		
		
		
		
		
		
	}
	
}
