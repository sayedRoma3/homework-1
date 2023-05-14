package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {

	private IO io;
	private String nome = "Comando non valido";
	
	@Override
	public void esegui(Partita partita) {
		this.io = partita.getIo();
		io.mostraMessaggio("Comando sconosciuto");
	}

	@Override
	public void setParametro(String parametro) {
		//non ha parametri
		
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return null;
	}

}
