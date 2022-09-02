package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codiceUnivoco;
	private String descrizione;
	private Tipo tipo;
	private int numeroMassimoOccupanti;
	@OneToOne
	private Edificio edificio;

}
