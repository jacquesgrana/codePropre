package ex2;

/**
 * Classe qui représente un compte bancaire de type livret A.
 * Ajout du taux de rémunération du livret. 
 * @author jacques
 */
public class LivretA extends CompteBancaire { 
	
	/** tauxRemuneration : taux de rémunération du Livret A. */
	private double tauxRemuneration;
	
	/**
	 * Constructeur. 
	 * @param type
	 * @param solde
	 * @param tauxRemunearation
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * Méthode qui applique la rémunération au solde selon la taux de rémunération. 
	 */
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}
	
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}	
	}

	/**
	 * Cetter du taux de rémunération. 
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter du taux de rémunération. 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
