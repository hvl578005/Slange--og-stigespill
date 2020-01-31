package slangespill;

/**
 * 
 * @author KathrineH
 *
 */

public class Brikke {
	
	private Rute rute;
	private Farge farge;
	private Brett brett;
	
	
	public Brikke (Brett brett, Farge farge, Rute rute) {
		this.brett = brett;
		this.farge = farge;
		this.rute = brett.getBrett().get(0);
	}
	
	/**
	 * 
	 * @param verdi
	 * here we move a brikke from rute to another rute 
	 * if the dies value + the rute number is over 100 it will not move
	 */
	
	public void flytt(Integer verdi) {
		if (rute.getRutenummer() + verdi <= 100) {
			Rute nyRute = brett.flyttRute(rute, verdi);
			setRute(nyRute);
		}
	}
	
	/**
	 * 
	 * @return farge
	 */
	
	public Farge getFarge() {
		return farge;
	}
	
	/**
	 * 
	 * @param farge
	 */

	public void setFarge(Farge farge) {
		this.farge = farge;
	}
	
	/**
	 * 
	 * @return rute
	 */
	
	public Rute getRute() {
		return rute;
	}
	
	/**
	 * 
	 * @param rute
	 */

	public void setRute(Rute rute) {
		this.rute = rute;
	}
	
	/**
	 * 
	 * @return brett
	 */

	public Brett getBrett() {
		return brett;
	}
	
	/**
	 * 
	 * @param brett
	 */

	public void setBrett(Brett brett) {
		this.brett = brett;
	}
	
	
}
