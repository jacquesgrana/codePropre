package ex3;

import java.util.List;

public abstract class Zone {
	
	protected String type;
	protected List<Animal> animaux;
	
	/**
	 * Constructeur. 
	 * 
	 * @param type
	 * @param animaux
	 */
	public Zone(String type, List<Animal> animaux) {
		this.type = type;
		this.animaux = animaux;
	}

	/**
	 * Ajoute un animal à la zone. 
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}

	/**
	 * Affiche la liste des animaux de la zone. 
	 * 
	 */
	public void afficherListeAnimaux(){
		for (Animal animal: this.animaux){
			System.out.println(animal.getNom());
		}
	}
	
	/**
	 * Renvoi le nombre d'animaux de la zone. 
	 * 
	 * @return
	 */
	public int compterAnimaux(){
		return this.animaux.size();
	}
	
	/**
	 * Renvoi le nombre de kg de nourriture par jour. 
	 */
	public abstract double calculerKgsNourritureParJour();

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/**
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	

}
