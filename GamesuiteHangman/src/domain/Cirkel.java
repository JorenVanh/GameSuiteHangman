package domain;

import java.awt.Graphics;

public class Cirkel extends Vorm implements Drawable{
	private int radius;
	private Punt middelpunt;
	
	
	public Cirkel(Punt middelpunt, int radius){
		setRadius(radius);
		setMiddelpunt(middelpunt);
	}

	//getters
	public int getRadius() {
		return radius;
	}

	public Punt getMiddelpunt() {
		return middelpunt;
	}

	//setters
	private void setRadius(int radius){
		if (radius<=0){
				throw new DomainException("De straal moet groter zijn dan 0");
		}
		this.radius = radius;
	}

	private void setMiddelpunt(Punt middelpunt) {
		if (middelpunt==null){
			throw new DomainException("Geef een geldig punt");
		}
		this.middelpunt = middelpunt;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Cirkel){
			Cirkel c = (Cirkel) o;
			if (this.radius==c.getRadius() && this.middelpunt.equals(c.getMiddelpunt())){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cirkel met radius" + radius + "en middelpunt" + middelpunt ;
	}

	@Override
	public Omhullende getOmhullende() {
		Punt p = new Punt(this.middelpunt.getX()-this.radius, this.middelpunt.getY()-radius);
		Omhullende omhullende = new Omhullende(p, radius+radius, radius+radius);
		return omhullende;
		
	}
	
	@Override
	public void teken(Graphics graphics){
		int x=getMiddelpunt().getX();
		int y=getMiddelpunt().getY();
		int r=getRadius();
		x = x-(r/2);
		y = y-(r/2);
		graphics.fillOval(x,y,r,r);
	}
	
	
	

}
