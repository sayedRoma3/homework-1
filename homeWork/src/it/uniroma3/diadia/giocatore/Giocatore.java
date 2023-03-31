package it.uniroma3.diadia.giocatore;


/**
 * Classe ha la responsabilit� di gestire i CFU del giocatore e
 * di memorizzare gli attrezzi in un oggetto istanza della classe
 * Borsa
 * @author caste
 *
 */

public class Giocatore {
	
	static final private int CFU_INIZIALI = 20;
	private int cfu;
	private Borsa borsa;
	
	public Giocatore() {
		this.cfu = CFU_INIZIALI;
		this.borsa= new Borsa();
	}
	
	public int getCfu() {
		return cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
	
	public Borsa getBorsa() {
		return this.borsa;
	}
	
}
