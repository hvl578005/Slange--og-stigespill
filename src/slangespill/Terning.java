package slangespill;

import java.util.Random;

/**
 * 
 * @author KathrineH
 *
 */

public class Terning {
	
	private Integer verdi;

	/**
	 * @void roll the dice
	 */
	public void trillTerning() {
		
		Random tall = new Random();
		verdi = 1 + tall.nextInt(6);
				
	}
	
	/**
	 * 
	 * @return value to dice
	 */
	
	public int getVerdi() {
		return this.verdi;
	}

}
