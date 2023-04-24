package it.uniroma3.diadia.comandi;

import java.util.Scanner;

import it.uniroma3.diadia.Partita;


public interface Comando {
	/**
	* esecuzione del comando
	*/
	public void esegui(Partita partita);
	

}
