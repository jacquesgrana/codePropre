package ex4;

import java.util.Date;

public class Pret {

	private Strategy strategy;
	//private double capital;
	private double capitalRestantDu;
	//private double taux;
	//private Date dateDebut;
	private Date dateFin;
	
	/**
	 * Constructeur à 3 paramètres. 
	 * 
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 */
	public Pret(double capital, double taux, Date dateDebut) {
		super();
		this.strategy = new PretATerme(capital, taux, dateDebut);
	}
	
	/**
	 * Constructeur à 4 paramètres. 
	 * 
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		super();
		this.strategy = new PretATerme(capital, taux, dateDebut);
		this.dateFin = dateFin;
	}
	
	/**
	 * Constructeur à 5 paramètres. 
	 * 
	 * @param capital
	 * @param capitalRestantDu
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 */
	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		super();
		this.strategy = new PretATerme(capital, taux, dateDebut);
		this.capitalRestantDu = capitalRestantDu;
		this.dateFin = dateFin;
	}

	/** Getter for strategy
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/** Setter
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/** Getter for capitalRestantDu
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/** Setter
	 * @param capitalRestantDu the capitalRestantDu to set
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/** Getter for dateFin
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
}
