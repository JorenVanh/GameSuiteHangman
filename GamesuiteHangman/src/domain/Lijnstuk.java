package domain;

import java.awt.Graphics;

public class LijnStuk extends Vorm {
	private Punt startpunt;
	private Punt eindpunt;
	private Punt punt = new Punt();

	public LijnStuk(Punt startpunt, Punt eindpunt) {
		setStartEnEindPunten(startpunt, eindpunt);

	}

	public void setStartEnEindPunten(Punt startpunt, Punt eindpunt) {
		if (startpunt == null || eindpunt == null) {
			throw new DomainException("Mag niet leeg of gelijk zijn.");
		}
		this.startpunt = startpunt;
		this.eindpunt = eindpunt;
	}

	public Punt getStartpunt() {
		return this.startpunt;
	}

	public Punt getEindpunt() {
		return this.eindpunt;
	}

	public boolean equals(Object object) {
		boolean resultaat = false;
		if (object instanceof LijnStuk) {

			LijnStuk figuur = (LijnStuk) object;
			if (this.getStartpunt().equals(figuur.getStartpunt()) || this.getEindpunt().equals(figuur.getEindpunt())) {
				resultaat = true;
			}
		}
		return resultaat;
	}

	public String toString() {
		return "(" + startpunt + ", " + eindpunt + ")";
	}

	@Override
	public Omhullende getOmhullende() {
		int iks = Math.min(this.startpunt.getX(), this.eindpunt.getX());
		int ei = Math.min(this.startpunt.getY(), this.eindpunt.getY());
		int breedte = Math.abs(startpunt.getX()-eindpunt.getX());
		int hoogte = Math.abs(startpunt.getY()- eindpunt.getY());
		Punt p = new Punt(iks,ei);
		Omhullende omhullende = new Omhullende(p, breedte, hoogte);
		return omhullende;

	}
	
	public void teken(Graphics graphics){
		
	}
}
