package fr.doranco.wineo.ihm;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import fr.doranco.wineo.ihm.objetmetier.Bouteille;
import fr.doranco.wineo.ihm.objetmetier.Cave;
import fr.doranco.wineo.ihm.store.CaveStore;

/**
 * Un contrôleur MVC de caves.
 * 
 * @author Snekkja JFDC
 */
@ManagedBean
@SessionScoped
public class CaveControleur implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Cave à détailler */
	private Cave cave;
	
	private String proprietaire;
	
	@Inject
	private CaveStore caveStore;

	/**
	 * Construire un contrôleur MVC de caves.
	 */
	public CaveControleur() {
		super();
	}
	
	public List<Bouteille> obtenirBouteilles() {
		return caveStore.obtenirCave(proprietaire).getBouteilles();
	}
	
	/**
	 * Construire un contrôleur MVC de caves.
	 * @param cave Une cave à détailler.
	 */
	public CaveControleur(Cave cave) {
		super();
		this.cave = cave;
	}
	
	public Cave getCave() {
		return cave;
	}

	public void setCave(Cave cave) {
		this.cave = cave;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
