package ex3;

import java.util.List;

/**
 * Classe des objet auarium
 * 
 * @author jacques
 */
public class Aquarium extends Zone{

	/**
	 * Constructeur. 
	 * 
	 * @param animaux
	 */
	public Aquarium(List<Animal> animaux) {
		super("Aquarium", animaux);
	}
	
	@Override
	public double calculerKgsNourritureParJour(){
		return this.animaux.size() * 0.2;
	}
}
