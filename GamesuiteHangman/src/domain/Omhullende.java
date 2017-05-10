package domain;

public class Omhullende {
	private Punt linkerBovenhoek;
	private int breedte, hoogte;

	public Omhullende(Punt linkerBovenhoek, int breedte, int hoogte) {
		setPositieLinksBoven(linkerBovenhoek);
		setBreedte(breedte);
		setHoogte(hoogte);
	}

	public Punt getLinkerBovenhoek() {
		return linkerBovenhoek;
	}

	private void setPositieLinksBoven(Punt positieLinksBoven) {
		if (positieLinksBoven == null) {
			throw new DomainException("De positie mag niet leeg zijn.");
		}
		this.linkerBovenhoek = positieLinksBoven;
	}

	public int getBreedte() {
		return breedte;
	}

	private void setBreedte(int breedte) {
		if (breedte < 0) {
			throw new DomainException("De breedte mag niet kleiner zijn dan nul");
		}
		this.breedte = breedte;
	}

	public int getHoogte() {
		return hoogte;
	}

	private void setHoogte(int hoogte) {
		if (hoogte < 0) {
			throw new DomainException("De hoogte mag niet kleiner zijn dan nul");
		}
		this.hoogte = hoogte;
	}

	public int getMaximaleX() {
		int x;
		x = linkerBovenhoek.getX() + breedte;
		return x;
	}

	public int getMaximaleY() {
		int y;
		y = linkerBovenhoek.getY() + hoogte;
		return y;
	}

	public int getMinimaleX() {
		return linkerBovenhoek.getX();
	}

	public int getMinimaleY() {
		return linkerBovenhoek.getY();
	}

	public boolean equals(Object object){
		boolean res = false;
		if(object instanceof Omhullende){
			Omhullende figuur = (Omhullende)object;
			if (this.breedte == figuur.breedte && this.hoogte == figuur.hoogte && this.linkerBovenhoek.equals(figuur.linkerBovenhoek)){
				res = true;
			}
		}
		return res;
	}

	public String toString() {
		return "Rechthoek: positie: " + this.getLinkerBovenhoek() + " - breedte: " + this.getBreedte() + " - hoogte: "
				+ this.getHoogte() + "\n" + "- omhullende: " + linkerBovenhoek + "- " + breedte + " - " + hoogte;
	}
	
	

}
