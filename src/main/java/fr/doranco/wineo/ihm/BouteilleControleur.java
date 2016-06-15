package fr.doranco.wineo.ihm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.doranco.wineo.ihm.objetmetier.Bouteille;

@ManagedBean(name = "bouteilleControleur")
@RequestScoped
public class BouteilleControleur {

	private List<Bouteille> bouteilles;
	
	public BouteilleControleur() {
		super();
		
		bouteilles = new ArrayList<>();
		
		bouteilles.add(new Bouteille("Chablis", new BigDecimal(0.75d), "Blanc",
				"Bourgogne", 2006, true));
		bouteilles.add(new Bouteille("Sancerre", new BigDecimal(0.75d), "Blanc",
				"Loire", 2005, false));
		bouteilles.add(new Bouteille("Monbazillac", new BigDecimal(1d), "Blanc",
				"Dordogne", 2012, false));
		bouteilles.add(new Bouteille("Saint-Emilion", new BigDecimal(0.75d), "Rouge",
				"Bordeaux", 2014, true));
		bouteilles.add(new Bouteille("Beaujolais Nouveau", new BigDecimal(0.75d), "Rouge",
				"Lyonnais", 2015, false));
		bouteilles.add(new Bouteille("Beaujolais Nouveau", new BigDecimal(0.75d), "Rouge",
				"Lyonnais", 2014, false));
		bouteilles.add(new Bouteille("Lambrusco", new BigDecimal(0.75d), "Rouge",
				"Po", 2014, false));
	}

	public List<Bouteille> getBouteilles() {
		return bouteilles;
	}

	public void setBouteilles(List<Bouteille> bouteilles) {
		this.bouteilles = bouteilles;
	}
	
}
