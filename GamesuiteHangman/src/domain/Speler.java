package domain;

import ui.DomainException;

public class Speler {
	private String naam;
	private int score;

	public Speler(String naam) {
		if ( naam == null||naam.trim().isEmpty()) {
			throw new DomainException("Naam mag niet leeg zijn!");
		} else {
			this.naam = naam;
		}
	}

	public String getNaam() {
		return naam;
	}

	public int getScore() {
		return score;
	}

	private void setScore(int score) {
		this.score = score;
	}

	public int addToScore(int score) {
		if (this.score + score < 0) {
			throw new DomainException("Score negatief!");
		}
		if (score < 0 && this.score + score < 0) {
			throw new IllegalArgumentException();
		} else {
			return this.score += score;
		}

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speler other = (Speler) obj;
		if (naam == null) {
			if (other.naam != null)
				return false;
		} else if (!naam.equals(other.naam))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speler:" + naam + "heeft als score:" + score;
	}

}
