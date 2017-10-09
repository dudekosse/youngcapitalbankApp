package nl.youngcapital.bankApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue
	private long id;
	private String naam;
	private long kluisInhoud;
	
	public Bank() {}
	
	public Bank(String naam) {
		this.naam = naam;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public long getKluisInhoud() {
		return kluisInhoud;
	}
	public void setKluisInhoud(long kluisInhoud) {
		this.kluisInhoud = kluisInhoud;
	}
	
	
	
}
