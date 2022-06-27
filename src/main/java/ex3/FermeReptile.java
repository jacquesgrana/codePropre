package ex3;

import java.util.List;

public class FermeReptile extends Zone{

	/**
	 * Constructeur. 
	 * 
	 * @param animaux
	 */
	public FermeReptile(List<Animal> animaux) {
		super("Ferme des Reptiles", animaux);
	}
	
	@Override
	public double calculerKgsNourritureParJour(){
		return this.animaux.size() * 0.1;
	}
}
