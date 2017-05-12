package domain;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class Tekening implements Drawable{
	private String naam;
	private static final int min_x = 0;
	private static final int min_y = 0;
	private static final int max_x = 399;
	private static final int max_y = 399;
	private ArrayList<Vorm> tekening;
	
	public Tekening(String n){
		setNaam(n);
		tekening = new ArrayList<>();
	}

	public String getNaam() {
		return naam;
	}

	
	private void setNaam(String naam) {
		if (naam == null || naam.trim().isEmpty() ){
			throw new IllegalArgumentException("De naam is niet correct");
		}
		this.naam = naam;
	}
	
	
	public void voegToe(Vorm vorm){
		
		if (vorm==null){
			throw new DomainException("De vorm mag niet null zijn");
		}
		if (vorm.getOmhullende().getLinkerBovenhoek().getX()<min_x || vorm.getOmhullende().getLinkerBovenhoek().getY()>max_y
			|| (vorm.getOmhullende().getLinkerBovenhoek().getX()+vorm.getOmhullende().getBreedte())>max_x
			|| (vorm.getOmhullende().getLinkerBovenhoek().getY()-vorm.getOmhullende().getHoogte())<min_y ){
			throw new DomainException("De vorm past niet in de tekening");			
		}
		int i =0;
		for(Vorm v : tekening){
			tekening.get(i).equals(v);		
		}
		
		tekening.add(vorm);
	}
	
	public Vorm getVorm(int i){
		if (i>tekening.size()){
			throw new DomainException("Zoveel vormen zijn er niet");
		}
		return tekening.get(i);
	}
	
	public int getAantalVormen(){
		return tekening.size();
	}
	
	public void verwijder(Vorm vorm){
		int i=0;
		int tv=tekening.size();
		for (Vorm v: tekening) {
			if (vorm.equals(v)){
				tv=i;
			}
			i++;
		}
		if (tv!=tekening.size()){
			tekening.remove(tv);
		}
	}

	
	
	public boolean bevat(Vorm vorm){
		for (Vorm v: tekening) {
			if (v.equals(vorm)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object o){
		if (o instanceof Tekening){
			Tekening t = (Tekening) o;
			if (t.getAantalVormen()!=tekening.size()){
				return false;
			}
			for (Vorm v: tekening){
				if(!t.bevat(v)){
					return false;
				}
			}
			
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		String tekst="Tekening met naam "+getNaam()+" Bestaat uit "+(getAantalVormen())+" vormen:";
		for (Vorm v:tekening){
			tekst=tekst+"\n"+v.toString();
		}
		return tekst;
	}

	@Override
	public void teken(Graphics g) {
		for (Vorm v:tekening){
			v.teken(g);
		}
		
	}

	public Object getAantalOnzichtbaar() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
