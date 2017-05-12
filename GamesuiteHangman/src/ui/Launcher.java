package ui;

import javax.swing.JOptionPane;

import db.WoordenLezer;
import db.WoordenLijst;
import domain.Punt;
import domain.Speler;


public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		Speler speler = new Speler(naam);
		JOptionPane.showMessageDialog(null, "... heeft als score: " + speler.getScore(), naam,
				JOptionPane.INFORMATION_MESSAGE);
		PictionaryUi ui = new PictionaryUi(speler);
		ui.showMenu();
		JOptionPane.showMessageDialog(null, "... zal binnekort spelen", speler.getNaam(),
				JOptionPane.INFORMATION_MESSAGE);
		WoordenLezer lezer = new WoordenLezer("hangman.txt");
		WoordenLijst woordenLijst = lezer.lees();
		
		
	}
}
