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
	
	public boolean equals(Object object){
		if (this.x && this.y == object.y ){
			
		}
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
}
