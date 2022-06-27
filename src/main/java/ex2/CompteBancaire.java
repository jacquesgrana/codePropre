package ex2;

/**
 * Représente un compte bancaire. 
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;

	/**
	 * Constructeur. 
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Méthode qui ajoute un montant au solde. 
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Méthode qui débite un montant au solde. 
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter du solde. 
	 * 
	 * @return le solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter du solde. 
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter du découvert. 
	 * 
	 * @return le découvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter du découvert. 
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
