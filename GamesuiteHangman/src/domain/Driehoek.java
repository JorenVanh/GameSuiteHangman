package domain;

import java.awt.HeadlessException;

public class Driehoek extends Vorm{
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
	

	

}
