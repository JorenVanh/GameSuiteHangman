package domain;

public class Punt {
	private int x;
	private int y;
	
	public Punt(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public boolean equals (Object object){
		boolean resultaat = false;
		
		if (object instanceof Punt){
			Punt figuur = (Punt)object;
			resultaat = this.getX() == figuur.getX() && this.getY()==figuur.getY();
			
		}
		
	return resultaat;
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
}
