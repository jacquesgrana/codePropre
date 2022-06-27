package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe des objets Zoo. 
 * 
 * @author jacques
 */
public class Zoo {

	/**
	 * Nom du zoo. 
	 */
	private String nom;
	
	/**
	 * Représente la zone savane africaine. 
	 */
	private SavaneAfricaine savaneAfricaine;
	
	/**
	 * Représente la zone des carnivores. 
	 */
	private ZoneCarnivore zoneCarnivore;
	
	/**
	 * Représente la zone des reptiles. 
	 */
	private FermeReptile fermeReptile;
	
	/**
	 * Représente l'aquarium. 
	 */
	private Aquarium aquarium;
	
	private List<Zone> zones;
	
	
	/**
	 * Constructeur. 
	 * 
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**
	 * Init du zoo. 
	 */
	public void init() {
		savaneAfricaine = new SavaneAfricaine(new ArrayList<Animal>());
		zoneCarnivore = new ZoneCarnivore(new ArrayList<Animal>());
		fermeReptile = new FermeReptile(new ArrayList<Animal>());
		aquarium = new Aquarium(new ArrayList<Animal>());
		zones = new ArrayList<Zone>();
		zones.add(savaneAfricaine);
		zones.add(zoneCarnivore);
		zones.add(fermeReptile);
		zones.add(aquarium);
	}
	
	/**
	 * Ajoute un animal à la zone correcte. 
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
			//System.out.println("Carnivore ajouté");
		}
		else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
			//System.out.println("Herbivire ajouté");
		}
		else if (animal.getType().equals("REPTILE")){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getType().equals("POISSON")){
			aquarium.addAnimal(animal);
		}
	}
	
	/**
	 * Affiche les animaux des zones. 
	 */
	public void afficherListeAnimaux(){
		/*
		System.out.println("Savane africaine :\n");
		savaneAfricaine.afficherListeAnimaux();
		System.out.println("\n\nZone des carnivores :\n");
		zoneCarnivore.afficherListeAnimaux();
		System.out.println("\n\nFerme des reptiles :\n");
		fermeReptile.afficherListeAnimaux();
		System.out.println("\n\nAquarium :\n");
		aquarium.afficherListeAnimaux();
		*/
		
		for (Zone zone : zones) {
			System.out.println("\n" + zone.getType() + " :");
			zone.afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
