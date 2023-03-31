package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;

public class PartitaTest {
	
	private Partita partitaTest;
	
	@Before
	public void setUp() {
		this.partitaTest = new Partita();
	}

	@Test
	public void testVinta() {
		this.partitaTest.setStanzaCorrente(this.partitaTest.getLabirinto().getStanzaVincente());
		assertTrue(this.partitaTest.vinta());
	}
	
	@Test
	public void testVintaSeStanzaCorrenteDiversaDaVincente() {
		this.partitaTest.setStanzaCorrente(new Stanza("N1"));
		assertFalse(this.partitaTest.vinta());
	}
	
	@Test
	public void testVintaSeAppenaIniziata() {
		assertFalse(this.partitaTest.vinta());
	}
	

	@Test
	public void testIsFinitaSeCfuTerminati() {
		this.partitaTest.getGiocatore().setCfu(0);
		assertTrue(this.partitaTest.isFinita());
	}
	
	@Test
	public void testIsFinitaSeVinta() {
		this.partitaTest.setStanzaCorrente(this.partitaTest.getLabirinto().getStanzaVincente());		
		assertTrue(this.partitaTest.isFinita());
	}
	
	@Test
	public void testIsFinitaSeAppenaIniziata() {
		assertFalse(this.partitaTest.isFinita());
	}
	
}
