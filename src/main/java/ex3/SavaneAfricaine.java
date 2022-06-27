package ex3;

import java.util.List;

public class SavaneAfricaine extends Zone{

	/**
	 * Constructeur.
	 * 
	 * @param animaux
	 */
	public SavaneAfricaine(List<Animal> animaux) {
		super("Savane Africaine", animaux);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerKgsNourritureParJour(){
		return this.animaux.size() * 10;
	}
}
