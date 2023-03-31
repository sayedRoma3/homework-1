package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PartitaTest {

	private Partita partitaTest;
	private Stanza stanzaVincente;

	@Before
	public void test() {

		this.partitaTest = new Partita();
		Stanza stanzaVincente = new Stanza("stanza vincente");
		partitaTest.getLabirinto().setStanzaVincente(stanzaVincente);

	}


	@Test
	public void testVinta() {
		
		assertTrue(partitaTest.vinta());
	}

	@Test
	public void testIsFinita() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStanzaCorrente() {
		fail("Not yet implemented");
	}

}
