package ui;

import db.DbException;
import db.WoordenLijst;
import domain.Speler;

public class HangmanUi {

	public HangmanUi(Speler speler, WoordenLijst woordenLijst){
		if(woordenLijst.getAantalWoorden()==0){
			throw new DbException();
		}
		String raadWoord = woordenLijst.getRandomWoord();
	}
	
	public void play(){
		
	}
}
