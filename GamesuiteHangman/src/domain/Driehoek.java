package domain;

import java.awt.Graphics;
import java.awt.HeadlessException;

public class Driehoek extends Vorm implements Drawable{
	private Punt hoekPunt1, hoekPunt2, hoekPunt3;
	
	public Driehoek(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3){
		setHoekPunten(hoekPunt1, hoekPunt2, hoekPunt3);
	}
	
	public void setHoekPunten(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3){
		if(hoekPunt1==null || hoekPunt2 == null || hoekPunt3==null){
			throw new DomainException("Hoekpunt mag niet leeg zijn");
		}
		if (hoekPunt1.equals(hoekPunt2) || hoekPunt1.equals(hoekPunt3) || hoekPunt2.equals(hoekPunt3)){
			throw new DomainException("De hoekpunten mogen niet samenvallen");
		}
		if( (hoekPunt2.getX()-hoekPunt1.getX())*(hoekPunt3.getY()-hoekPunt1.getY()) == (hoekPunt3.getX()-hoekPunt1.getX())*(hoekPunt2.getY()-hoekPunt1.getY()) ){
			throw new DomainException("De hoekpunten liggen alledrie op dezelfde lijn");
		}
		this.hoekPunt1 = hoekPunt1;
		this.hoekPunt2 = hoekPunt2;
		this.hoekPunt3 = hoekPunt3;
	}

	public Punt getHoekPunt1() {
		return hoekPunt1;
	}

	public Punt getHoekPunt2() {
		return hoekPunt2;
	}

	public Punt getHoekPunt3() {
		return hoekPunt3;
	}
	
	@Override
	public boolean equals (Object object){
		if (object instanceof Driehoek){
			
			Driehoek d = (Driehoek) object;
			
			if (this.hoekPunt1.equals(d.getHoekPunt1()) || this.hoekPunt1.equals(d.getHoekPunt2()) || this.hoekPunt1.equals(d.getHoekPunt3())){
				if (this.hoekPunt2.equals(d.getHoekPunt1()) || this.hoekPunt2.equals(d.getHoekPunt2()) || this.hoekPunt2.equals(d.getHoekPunt3())){
					if (this.hoekPunt3.equals(d.getHoekPunt1()) || this.hoekPunt3.equals(d.getHoekPunt2()) || this.hoekPunt3.equals(d.getHoekPunt3())){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Driehoek: hoekPunt1:" + hoekPunt1.toString() + " - hoekPunt2:" + hoekPunt2.toString() + " - hoekPunt3:" + hoekPunt3.toString();
	}

	@Override
	public Omhullende getOmhullende() {
		int p1 = Math.min(this.hoekPunt1.getX(), this.hoekPunt2.getX());
		int p2 = Math.min(p1, this.hoekPunt3.getX());
		int p3 = Math.min(this.hoekPunt1.getY(), this.hoekPunt2.getY());
		int p4 = Math.min(p3, this.hoekPunt3.getY());
		Punt p = new Punt(p2, p4);
		int h1 = Math.max(this.hoekPunt1.getX(), this.hoekPunt2.getX());
		int h2 = Math.max(h1, this.hoekPunt2.getX());
		int h3 = Math.max(this.hoekPunt1.getY(), this.hoekPunt2.getY());
		int h4 = Math.max(h3, this.hoekPunt3.getY());
		Punt h = new Punt(h2, h4);
		int breedte = Math.abs(p.getX()-h.getX());
		int hoogte = Math.abs(p.getY() - h.getY());
		
		Omhullende omhullende = new Omhullende(p, breedte, hoogte);
		return omhullende;
	}
	
	public void teken(Graphics graphics){
		int[] xwaarden=new int[] {hoekPunt1.getX(),hoekPunt2.getX(),hoekPunt3.getX()};
		int[] ywaarden=new int[] {hoekPunt1.getY(),hoekPunt2.getY(),hoekPunt3.getY()};
		graphics.drawPolygon(xwaarden, ywaarden, 3);
	}

	

}
