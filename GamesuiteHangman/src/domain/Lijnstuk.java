package domain;

public class Lijnstuk {
	private Punt startpunt;
	private Punt eindpunt;
	private Punt punt = new Punt();

	public Lijnstuk(Punt startpunt, Punt eindpunt) {
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
		if (object instanceof Lijnstuk) {
			Lijnstuk figuur = (Lijnstuk) object;
			if( figuur.getStartpunt().equals(figuur.getEindpunt())){
				return true;
			}
			}
		System.out.println(resultaat);
		
		return resultaat;
	}

	public String toString() {
		return "(" + startpunt + ", " + eindpunt + ")";
	}
}
