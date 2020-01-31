package slangespill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 * @author KathrineH
 *
 */

public class Slangespill {
	
	private Scanner sc = new Scanner(System.in);
	private boolean vinner = false;
	private Brett brett = new Brett();
	private List<Spiller> spillere = new ArrayList<Spiller>();
	private Spiller spiller;
	
	
	public void opprettSpiller() {
		
		/**
		 * makes sure you write only between 2 and 4 players and dont write in letters.
		 * if you write alphabetic letters the system crash so we need regex letters
		 */
		
		System.out.println("Oppgi antall spillere");
		String antalli = sc.nextLine();
		
		String regexA = "^[0-9]$";
		while (!antalli.matches(regexA)) {
			System.out.println("Antall spillere skal være mellom 2 og 4. Skriv på ny.");
			antalli = sc.nextLine();
		}
		
		int antall = Integer.parseInt(antalli);
	
		while (((antall < 2) || (antall > 4))) {
			System.out.println("Antall spillere skal være mellom 2 og 4. Skriv på ny.");
			antalli = sc.nextLine();
			antall = Integer.parseInt(antalli);
		} 
	
			for (int i=1; i<=antall; i++) {
				
				System.out.println("Oppgi navn på spiller " + i + ".");
				String navn = sc.nextLine();
				
				String regex = "[A-ZÆØÅa-zæøå ]+";
				
				/**
				 * make sure that then name only contains letters so the program doesnt crash
				 */
				
				while (!navn.matches(regex)) {
					System.out.println("Navn kan kun inneholde bokstaver A-Å. Prøv på nytt.");
					navn = sc.nextLine();
				}
				
				System.out.println("Oppgi farge på brikke " + i + ".");
				System.out.println("Du kan velge 1: Rød. 2: Grønn. 3: Gul. 4: Blå.");
				int svar = sc.nextInt();
				sc.nextLine();
				Farge farge = null;
				
				switch (svar) {
					case 1: farge = Farge.ROD; break;
					case 2: farge = Farge.GRONN; break;
					case 3: farge = Farge.GUL;  break;
					case 4: farge = Farge.BLA; break;
				}
					
				spiller = new Spiller(navn, farge, brett);
				spillere.add(spiller);	
		}
	}
	
	/**
	 * start the game!
	 * first you create the players, then you play spillRunde() until someone has won.
	 * 
	 */
	
	public void startSpill() {
		
		opprettSpiller();
		
		while (vinner == false) {
			spillRunde();
		} 	
		vinner();
	}
	
	/**
	 * spillRunde() plays the game by calling on spillTrekk()
	 * and loops until someone has won
	 */
	
	public void spillRunde() {
		for (int i=0; i<spillere.size(); i++) {
			spillere.get(i).spillTrekk();
			if (spillere.get(i).getBrikke().getRute().getRutenummer() == 100) {
				vinner = true;
			}
		}	
	}
	
	/**
	 * this method checks if someone has won. If so, the game is over!
	 */
	
	public void vinner() {
		
		String spillernavn = spillere.stream().filter(p -> p.getBrikke().getRute().getRutenummer() == 100)
				.map(p -> p.getNavn()).collect(Collectors.joining());
		
		System.out.println(spillernavn + " har vunnet! Gratulererer.");
	}
	
	
	}

