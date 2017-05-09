package domain;

public abstract class Vorm {
	
	public boolean equals(Object O){
		if(!(O instanceof Vorm)){
			return false;
		}
		else return true;
	}
		

}
