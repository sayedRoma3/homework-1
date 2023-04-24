package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

/**
 * le informazioni sulla stanza corrente e sullo stato della partita
 * @author said
 *
 */

public class ComandoGuarda implements Comando{

	@Override
	public void esegui(Partita partita) {
		partita.getStanzaCorrente().toString();
		System.out.println(partita.getGiocatore().getCfu());
		
	}
 
	

}
