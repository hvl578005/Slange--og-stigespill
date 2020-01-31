package slangespill;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author KathrineH
 *
 */

public class Brett {
	
	private List<Rute> brett;
	
	/**
	 * constructor to a new board
	 */
	
	public Brett () {
		this.brett = new ArrayList<Rute>();
		leggTilRuter();
	}
	
	/**
	 * adding 100 ruter to the board
	 */
	
	public void leggTilRuter() {
		for (int i=1; i<=100; i++) {
			Rute rute = new Rute();
			rute.setRutenummer(i);
			brett.add(rute);
		}
	}
	
	/**
	 * 
	 * @param rute
	 * @param verdi
	 * @return nyRute
	 * here we decide which new route the brikke is going to move to
	 * we also check if the new route the brikke falls on if it landed on a snake route or a ladder route
	 */
	
	public Rute flyttRute(Rute rute, Integer verdi) {
		Rute nyRute = brett.get(rute.getRutenummer() + verdi -1);
		
		/**
		 * CHECK IF THEY LAND ON SNAKES OR LADDERS
		 */
		
		sjekkeStiger(nyRute);
		sjekkeSlanger(nyRute);
		
		return nyRute;
		
	}
	
	/**
	 * 
	 * @return brett
	 */

	public List<Rute> getBrett() {
		return brett;
	}
	
	/**
	 * 
	 * @param nyRute
	 * @return nyRute
	 * because our brett is a list not an array[] i could not figure out how to do this
	 * so i decided to do a lot of if sentences. 
	 * it is pretty amateur but it works :))
	 */
	
	public Rute sjekkeStiger(Rute nyRute) {
		
		
		if (nyRute.getRutenummer() == 2) {
			nyRute.setRutenummer(38);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		} else if (nyRute.getRutenummer() == 4) {
			nyRute.setRutenummer(14);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		} else if (nyRute.getRutenummer() == 8) {
			nyRute.setRutenummer(31);
			System.out.println("Du landet på en stige og ble flyttet opp.");	
		} else if (nyRute.getRutenummer() == 21) {
			nyRute.setRutenummer(42);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		} else if (nyRute.getRutenummer() == 28) {
			nyRute.setRutenummer(84);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		} else if (nyRute.getRutenummer() == 36) {
			nyRute.setRutenummer(44);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		} else if (nyRute.getRutenummer() == 51) {
			nyRute.setRutenummer(67);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		} else if (nyRute.getRutenummer() == 71) {
			nyRute.setRutenummer(91);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		} else if (nyRute.getRutenummer() == 80) {
			nyRute.setRutenummer(100);
			System.out.println("Du landet på en stige og ble flyttet opp.");
		}
		return nyRute;
	}
	
	/**
	 * 
	 * @param nyRute
	 * @return nyRute
	 */
	
	
	public Rute sjekkeSlanger(Rute nyRute) {
		
		if (nyRute.getRutenummer() == 15) {
			nyRute.setRutenummer(6);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 47) {
			nyRute.setRutenummer(26);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 49) {
			nyRute.setRutenummer(11);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 87) {
			nyRute.setRutenummer(24);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 56) {
			nyRute.setRutenummer(53);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 64) {
			nyRute.setRutenummer(60);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 98) {
			nyRute.setRutenummer(78);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 96) {
			nyRute.setRutenummer(75);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 92) {
			nyRute.setRutenummer(73);
			System.out.println("Du landet på en slange og falt derfor ned.");
		} else if (nyRute.getRutenummer() == 62) {
			nyRute.setRutenummer(18);
			System.out.println("Du landet på en slange og falt derfor ned.");
		}
	
		return nyRute;
	}
	

}
