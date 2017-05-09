package ui;

import domain.*;
import javax.swing.JOptionPane;

public class PictionaryUi {
	private Speler speler ;
	
	public PictionaryUi(Speler speler){
		this.speler = speler;
	}
	
	public void showMenu(){
		int x = Integer.parseInt(JOptionPane.showInputDialog("X co�rdinaat van het punt: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Y co�rdinaat van het punt: "));
		
		Punt p = new Punt(x,y);
		JOptionPane.showConfirmDialog(null,"U heeft een correct punt aangemaakt: " + p.toString());
		int straal = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel:"));
		
		Cirkel cirkel = new Cirkel(p, straal);
		JOptionPane.showConfirmDialog(null, "U heeft een correct cirkel aangemaakt: Cirkel: middelPunt" + p + " - Straal  - " + straal);
		
		
	}
	
}
