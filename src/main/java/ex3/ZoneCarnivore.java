package ex3;

import java.util.List;

public class ZoneCarnivore extends Zone {
	
	/**
	 * Constructeur. 
	 * 
	 * @param listAnimaux
	 */
	public ZoneCarnivore(List<Animal> listAnimaux) {
		super("Zone des carnivores", listAnimaux);
		//this.animaux = listAnimaux;
	}

	@Override
	public double calculerKgsNourritureParJour(){
		return this.animaux.size() * 10;
	}
}
