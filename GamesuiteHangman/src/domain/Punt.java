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
	
	public boolean equals(Punt p){
		
		if (p != null && this.x == p.getX() && this.y == p.getY() ){
			
			return true;
		}
		return false;
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
}
