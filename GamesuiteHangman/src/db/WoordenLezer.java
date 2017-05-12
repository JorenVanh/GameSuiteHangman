package db;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class WoordenLezer {
	private String bestandsNaam;
	
	public WoordenLezer(String bestandsNaam){
		this.bestandsNaam = bestandsNaam;
	}
	
	public WoordenLijst lees(){
		WoordenLijst lezer = new WoordenLijst();
		Scanner scanner = new Scanner(bestandsNaam);
		while (scanner.hasNextLine()) { 
			Scanner scannerLijn = new Scanner(scanner.nextLine());
			String woord = scannerLijn.next();
			if(woord==null || woord.trim().isEmpty()){
				throw new DbException("woord mag niet leeg zijn");
			}
			lezer.voegToe(woord);
		}
return lezer;
	
	}

}
