package ui;

import domain.*;
import javax.swing.JOptionPane;

public class PictionaryUi {
	private Speler speler = new Speler();
	
	public PictionaryUi(Speler speler){
		this.speler = speler;
	}
	
	public void showMenu(){
		int x = Integer.parseInt(JOptionPane.showInputDialog("X coördinaat van het punt: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Y coördinaat van het punt: "));
		
		Punt p = new Punt(x,y);
		JOptionPane.showConfirmDialog(null,"U heeft een correct punt aangemaakt: " + p.toString());
	}
	
}
