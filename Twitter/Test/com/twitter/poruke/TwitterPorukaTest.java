package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {
	private TwitterPoruka tp;

	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
		tp = null;
	}

	@Test
	public void testSetKorisnik() {
		String korisnik = "Andrijana"; 
		tp.setKorisnik(korisnik);
		assertEquals(korisnik, tp.getKorisnik());
	}

	@Test
	public void testSetPoruka() {
		String poruka = "Ovo je test za set metodu";
		tp.setPoruka(poruka);
		assertEquals(poruka, tp.getPoruka());
	}

	@Test
	public void testToString() {
		tp.toString();
	}

	@Test (expected = java.lang.RuntimeException.class)
	 	public void testSetKorisnikNull() {
	 		tp.setKorisnik(null);
	 	}
	
	@Test (expected = java.lang.RuntimeException.class)
	 	public void testSetKorisnikPrazan() {
	 		tp.setKorisnik("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
 	public void testSetPorukaNull() {
 		tp.setPoruka(null);
 	}

	@Test (expected = java.lang.RuntimeException.class)
 	public void testSetPorukaPrazan() {
 		tp.setPoruka(" ");
}
	
}
