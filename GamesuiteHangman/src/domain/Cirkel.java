package domain;

public class Cirkel {
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
	
	

}