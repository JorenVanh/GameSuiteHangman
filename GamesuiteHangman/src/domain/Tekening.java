package domain;

import java.util.ArrayList;

public class Tekening {
	private String naam;
	private static final int min_x = 0;
	private static final int min_y = 0;
	private static final int max_x = 399;
	private static final int max_y = 399;
	private ArrayList<Vorm> tekening;
	
	public Tekening(String n){
		if (n.trim().isEmpty() || n == null){
			throw new DomainException("De naam is niet correct");
		}
		this.naam = n;
		tekening = new ArrayList<>();
	}

	public String getNaam() {
		return naam;
	}

	/* 
	private void setNaam(String naam) {
		if (naam.trim().isEmpty() || naam == null){
			throw new DomainException("De naam is niet correct");
		}
		this.naam = naam;
	}
	*/
	
	public void voegToe(Vorm vorm){
		if (vorm==null){
			throw new DomainException("De vorm mag niet null zijn");
		}
		int i =0;
		for(Vorm v : tekening){
			tekening.get(i).equals(v);		
		}
		
		tekening.add(vorm);
	}
	
	public Vorm getVorm(int i){
		if (i>tekening.size()){
			throw new DomainException("Zoveel vormen zijn er niet");
		}
		return tekening.get(i);
	}
	
	public int getAantalVormen(){
		return tekening.size();
	}
	
	public void verwijderVorm(Vorm vorm){
		int i=0;
		for (Vorm v: tekening) {
			if (v.equals(vorm)){
				tekening.remove(i);
			}
			i++;
		}	
	}

	
	
	

}
