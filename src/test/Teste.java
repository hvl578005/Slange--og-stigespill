package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import slangespill.Terning;
import slangespill.Slangespill;
import slangespill.Spiller;
import slangespill.Brett;
import slangespill.Farge;
import slangespill.Brikke;
import slangespill.Rute;
import slangespill.Klient;

/**
 * 
 * @author KathrineH
 *
 */

class Teste {
	
	Terning terning = new Terning();
	Slangespill slangespill = new Slangespill();			

	/**
	 * @test
	 */
	
	@Test
	public void terning() {
		terning.trillTerning();
		assertTrue(terning.getVerdi() > 0);
		terning.trillTerning();
		assertTrue(terning.getVerdi() < 7);
		terning.trillTerning();
		assertTrue(terning.getVerdi() != 9);
		terning.trillTerning();
		assertTrue(terning.getVerdi() > -10);
		terning.trillTerning();
		assertFalse(terning.getVerdi() == 10);
		terning.trillTerning();
		assertFalse(terning.getVerdi() > 100);
	}
	
}
