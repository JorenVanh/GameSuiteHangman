package domain;

import java.awt.Graphics;

public abstract class Vorm {
	String output = "";
	public boolean equals(Object O){
		if(!(O instanceof Vorm)){
			return false;
		}
		else{
			output = O.toString();
			return true;
		}
		
		
	}
	
	public abstract Omhullende getOmhullende();

	@Override
	public String toString() {
		
		return output + getOmhullende().toString();
	}
	
	public void teken(Graphics graphics){};
	
	
		

}
