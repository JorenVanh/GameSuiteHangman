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
		
		Object[] shapes = { "Cirkel", "Rechthoek", "Driehoek"};

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
		} else if(keuze.equals("Driehoek")) {
			int x2 = Integer.parseInt(JOptionPane.showInputDialog("X coördinaat van het tweede punt: "));
			int y2 = Integer.parseInt(JOptionPane.showInputDialog("Y coördinaat van het tweede punt: "));
			
			Punt p2 = new Punt(x2,y2);
			JOptionPane.showConfirmDialog(null,"U heeft een correct punt aangemaakt: " + p2.toString());
			
			int x3 = Integer.parseInt(JOptionPane.showInputDialog("X coördinaat van het derde punt: "));
			int y3 = Integer.parseInt(JOptionPane.showInputDialog("Y coördinaat van het derde punt: "));
			
			Punt p3 = new Punt(x3,y3);
			JOptionPane.showConfirmDialog(null,"U heeft een correct punt aangemaakt: " + p3.toString());
			
			Driehoek d = new Driehoek(p,p2,p3);
			JOptionPane.showConfirmDialog(null, "Uw heeft een correcte driehoek aangemaakt: " + d);
			
		}
		
		
		
		
		
		
	}
	
}
