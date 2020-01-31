package slangespill;

import java.util.Scanner;

/**
 * 
 * @author KathrineH
 *
 */

public class Spiller {
	
	private String navn;
	private Brikke brikke;
	private Rute rute;
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * 
	 * @param navn
	 * @param farge
	 * @param brett
	 */
	
	public Spiller(String navn, Farge farge, Brett brett) {
		this.navn = navn;
		this.brikke = new Brikke(brett, farge, rute);
	}
	
	public String getNavn() {
		return navn;
	}
	
	/**
	 * 
	 * @param navn
	 */

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	/**
	 * 
	 * @return brikke
	 */

	public Brikke getBrikke() {
		return brikke;
	}
	
	/**
	 * 
	 * @param brikke
	 */

	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}
	
	/**
	 * here is the method to play the game. 
	 * scanner.hasNextLine() is so we can press enter to roll the dice so it doesnt just loop by itself
	 * then we roll the dice and print out the value
	 * if the value is 6, the player can roll the dice once more
	 * if the value is 6 again, the player can roll again
	 * however if the value is 6 for the third time the player has to move its brikke back to rute 1
	 * then after all the if sentences the brikke gets moved and its the next players turn
	 */
	
	public void spillTrekk() {
		
		System.out.println("Det er nå " + navn + " sin tur.");
		System.out.println("Trykk enter for å trille!");
		
		if (scanner.hasNextLine()) {
			
			Terning terning = new Terning();
			terning.trillTerning();
			Integer verdi = terning.getVerdi();
			System.out.println(navn + " fikk terningkast " + verdi);
			
			if (verdi == 6) {
				
				System.out.println(navn + " får trille på nytt.");
				terning.trillTerning();
				Integer verdi2 = verdi + terning.getVerdi();
				System.out.println(navn + " fikk terningkast " + terning.getVerdi());
				verdi = verdi2;
				
				if (verdi == 12) {
					
					System.out.println(navn + " får trille på ny.");
					terning.trillTerning();
					System.out.println(navn + " fikk terningkast " + terning.getVerdi());
					Integer verdi3 = verdi2 + terning.getVerdi();
					verdi = verdi3;
				}
			}
						
			if (verdi == 18) {
				
				System.out.println(navn + " fikk terningkast 6 tre ganger på rad, må derfor begynne på start.");
				verdi = 0;
				brikke.getBrett().flyttRute(brikke.getBrett().getBrett().get(1), verdi);
				
			} else {
				
				brikke.flytt(verdi);
				
			}
			
			System.out.println(navn + " er nå på rute " + brikke.getRute().getRutenummer());
					
			scanner.nextLine();
			
		}		
	}
	
	
}
