package domain;



public class Rechthoek extends Vorm {
	private int breedte;
	private int hoogte;
	private Punt linkerBovenhoek;
	
	public Rechthoek(Punt linkerBovenHoek, int breedte, int hoogte){
		this.setLinkerBovenhoek(linkerBovenHoek);
		this.setBreedte(breedte);
		this.setHoogte(hoogte);
	}
	
	private void setLinkerBovenhoek(Punt hoek){
		if (hoek == null){
			throw new DomainException("Positie van het linker boven hoek mag niet null zijn.");
		}
		this.linkerBovenhoek = hoek;
	}
	
	private void setBreedte(int breedte){
		if (breedte <=0){
			throw new DomainException("De breedte mag niet kleiner of gelijk aan nul zijn.");
		}
		this.breedte = breedte;
	}
	
	private void setHoogte(int hoogte){
		if (hoogte <=0){
			throw new DomainException("De hoogte mag niet kleiner of gelijk aan nul zijn.");
		}
		this.hoogte = hoogte;
	}
	
	public int getHoogte(){
		return this.hoogte;
	}
	
	public int getBreedte(){
		return this.breedte;
	}
	
	public Punt getLinkerBovenhoek(){
		return this.linkerBovenhoek;
	}
	
	public boolean equals (Object object){
		boolean resultaat = false;
		
		if (object instanceof Rechthoek){
			Rechthoek figuur = (Rechthoek)object;
			resultaat = this.getLinkerBovenhoek().equals(figuur.getLinkerBovenhoek()) && this.getBreedte()==figuur.getBreedte() && this.getHoogte() == figuur.getHoogte();
			
		}
		
	return resultaat;
	}
	
	public String toString(){
		return "Rechthoek: positie: " + this.getLinkerBovenhoek() + " - breedte: " + this.getBreedte() + " - hoogte: " + this.getHoogte();
	}

	@Override
	public Omhullende getOmhullende() {
		return null;

	}
}
