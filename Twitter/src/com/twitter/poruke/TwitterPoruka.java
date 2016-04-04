package com.twitter.poruke;
/**
 * 
 * Klasa koja postavlja vrednost korisnika i vrednost poruke koju korisnik
 * unosi kao i njihovo prikazivanje 
 *
 */
public class TwitterPoruka {
	/** uvodi se atribut korisnik */
	private String korisnik;
	/** uvodi se atribut poruka */
	private String poruka;

	public String getKorisnik() {
		return korisnik;
	}

	/** 
	 * set metoda za ispravan unos korisnika koji ne sme da bude 
	 *  null niti prazan string
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	public String getPoruka() {
		return poruka;
	}

	/**
	 * set metoda za ispravan unos poruke koja ne sme biti null i duzine vece od 140 znakova
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka == " " || poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * metoda koja vraca String sa nazivom korisnika i porukom koju je uneo
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}

}
