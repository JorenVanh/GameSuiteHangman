package db;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import domain.DomainException;

public class WoordenLijst {
	private List<String> woorden;
	
	public WoordenLijst(){
		this.woorden = new ArrayList<>();
	}

	public void voegToe(String woord) {
		if(woord==null || woord.trim().isEmpty()) throw new DomainException("Mag niet null zijn");
		for(int i=0; i < woorden.size();i++){
			if(this.woorden.get(i).equals(woord)){
				throw new DomainException("Woord Bestaat al");
			}
		}
		woorden.add(woord);
	}

	public int getAantalWoorden() {
			return woorden.size();
	}
	
	public String getRandomWoord(){
		Random rand = new Random();
		int  n = rand.nextInt(woorden.size()-1) + 1;
		
		return woorden.get(n);
	}

}
