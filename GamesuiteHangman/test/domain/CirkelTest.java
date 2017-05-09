package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirkelTest {
	private Punt middelpunt1= new Punt(10,10);
	private int straal1 = 5;
	
	@Test
	public void Cirkel_moet_Cirkel_aanmaken_met_geldige_waarden() {
		Cirkel cirkel1 = new Cirkel(middelpunt1, straal1);
		
		assertEquals(middelpunt1, cirkel1.getMiddelpunt());
		assertEquals(straal1, cirkel1.getRadius());
	}
	
	@Test (expected = DomainException.class)
	public void Cirkel_met_middelpunt_is_null_gooit_exception(){
		new Cirkel(null, straal1);
	}
	
	@Test (expected = DomainException.class)
	public void Cirkel_met_straal_kleiner_dan_0_gooit_exception(){
		new Cirkel(middelpunt1,-1);
	}
	
	@Test (expected = DomainException.class)
	public void Cirkel_met_straal_is_0_gooit_exception(){
		new Cirkel(middelpunt1,0);
	}
	
	@Test 
	public void Twee_cirkels_met_zelfde_middelpunt_en_straal_zijn_gelijk(){
		Punt middelpunt2=new Punt(10,10);
		Cirkel cirkel1 = new Cirkel(middelpunt1,straal1);
		Cirkel cirkel2 = new Cirkel(middelpunt2,5);
		
		cirkel1.equals(cirkel2);
	}
	
	@Test
	public void Twee_cirkels_zijn_niet_gelijk_als_de_tweede_gelijk_is_aan_null(){
		Cirkel cirkel1 = new Cirkel(middelpunt1,straal1);
		cirkel1.equals(null);
	}
	
	@Test
	public void Twee_cirkels_zijn_verschillend_als_hun_middelpunt_niet_gelijk_is(){
		Cirkel cirkel1 = new Cirkel(middelpunt1,straal1);
		Punt middelpunt3=new Punt(5,5);
		Cirkel cirkel3 = new Cirkel(middelpunt3,5);
		
		cirkel1.equals(cirkel3);
	}
	
	@Test
	public void Twee_cirkels_zijn_verschillend_wanneer_hun_straal_verschillend_is(){
		Cirkel cirkel1 = new Cirkel(middelpunt1,straal1);
		Cirkel cirkel4 = new Cirkel(middelpunt1,7);
		
		cirkel1.equals(cirkel4);
	}
	
	
	
	
	
	

}
