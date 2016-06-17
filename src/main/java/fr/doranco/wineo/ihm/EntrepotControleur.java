package fr.doranco.wineo.ihm;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.doranco.wineo.ihm.objetmetier.Cave;
import fr.doranco.wineo.ihm.store.CaveStore;

/**
 * Un contrôleur des entrepôts.
 * 
 * @author Snekkja JFDC
 */
@ManagedBean
@SessionScoped
public class EntrepotControleur implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Cave caveDetaillee;
	
	@Inject
	private CaveStore caveStore;
	
	/**
	 * Constuire un controleur MVC des entrepôts.
	 */
	public EntrepotControleur() {
		super();
	}
	
	public List<Cave> obtenirCaves() {
		return caveStore.obtenirCaves();
	}
	
	public String detaillerCave(Cave cave) {
		this.caveDetaillee = cave;
		return "PF('detailCave').show();";
	}
	
	public Cave getCaveDetaillee() {
		return caveDetaillee;
	}

	public void setCaveDetaillee(Cave caveDetaillee) {
		this.caveDetaillee = caveDetaillee;
	}
	
}
