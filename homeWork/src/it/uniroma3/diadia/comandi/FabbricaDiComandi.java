package it.uniroma3.diadia.comandi; 

import java.util.Scanner;

public class FabbricaDiComandi {
	@Override
	public Comando costruisciComando(String istruzione) {
		Scanner scannerDiParole = new Scanner(istruzione);
		String nomeComando = null;
		String parametro = null;
		Comando comando = null;

		if (scannerDiParole.hasNext())
			nomeComando = scannerDiParole.next();// prima parola:nome del comando
		if (scannerDiParole.hasNext())
			parametro = scannerDiParole.next();  // seconda parola: eventuale param.

		if (nomeComando == null)


		return comando;
	}
}
