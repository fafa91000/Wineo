package fr.doranco.wineo.ihm.objetmetier;

import java.io.Serializable;
import java.util.List;

/**
 * Une cave à vin.
 * 
 * @author Snekkja JFDC
 */
public class Cave implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** Ensemble de bouteilles */
	private List<Bouteille> bouteilles;

	/** Température exprimée en C° */
	private Double temperature;
	
	/** Capacité */
	private Integer capacite;
	
	/** Propriétaire */
	private String proprietaire;

	/**
	 * Construire une cave.
	 */
	public Cave() {
		super();
	}

	/**
	 * Construire une cave.
	 * 
	 * @param bouteilles Un ensemble de bouteilles.
	 * @param temperature Une température exprimée en C°.
	 * @param capacite Une capacité exprimée en nombre de bouteilles.
	 * @param proprietaire Un nom de propriétaire. 
	 */
	public Cave(List<Bouteille> bouteilles, Double temperature, Integer capacite, String proprietaire) {
		super();
		this.bouteilles = bouteilles;
		this.temperature = temperature;
		this.capacite = capacite;
		this.proprietaire = proprietaire;
	}

	public List<Bouteille> getBouteilles() {
		return bouteilles;
	}

	public void setBouteilles(List<Bouteille> bouteilles) {
		this.bouteilles = bouteilles;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
