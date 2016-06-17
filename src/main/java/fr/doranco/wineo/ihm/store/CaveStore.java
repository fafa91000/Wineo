package fr.doranco.wineo.ihm.store;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import fr.doranco.wineo.ihm.objetmetier.Bouteille;
import fr.doranco.wineo.ihm.objetmetier.Cave;

@ManagedBean
@ApplicationScoped
public class CaveStore {

	{
		caves = new ArrayList<>();
		
		List<Bouteille> bouteilles1 = new ArrayList<>();
		List<Bouteille> bouteilles2 = new ArrayList<>();
		
		bouteilles1.add(new Bouteille("Chablis", new BigDecimal(0.75d), "Blanc",
				"Bourgogne", 2006, true));
		bouteilles1.add(new Bouteille("Sancerre", new BigDecimal(0.75d), "Blanc",
				"Loire", 2005, false));
		bouteilles1.add(new Bouteille("Monbazillac", new BigDecimal(1d), "Blanc",
				"Dordogne", 2012, false));
		bouteilles2.add(new Bouteille("Saint-Emilion", new BigDecimal(0.75d), "Rouge",
				"Bordeaux", 2014, true));
		bouteilles2.add(new Bouteille("Beaujolais Nouveau", new BigDecimal(0.75d), "Rouge",
				"Lyonnais", 2015, false));
		bouteilles2.add(new Bouteille("Beaujolais Nouveau", new BigDecimal(0.75d), "Rouge",
				"Lyonnais", 2014, false));
		bouteilles2.add(new Bouteille("Lambrusco", new BigDecimal(0.75d), "Rouge",
				"Po", 2014, false));
		
		caves.add(new Cave(bouteilles1, 18d, 25, "Toto"));
		caves.add(new Cave(bouteilles2, 18.5d, 50, "Ajax"));
	}
	
	private static List<Cave> caves;
	
	public Cave obtenirCave(String proprietaire) {
		
		return caves.stream()
			.filter(p -> p.getProprietaire().equals(proprietaire))
			.findFirst()
			.orElse(null);
	}
	
	public List<Cave> obtenirCaves() {
		return caves;
	}
	
}
