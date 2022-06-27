package ex4;

import java.util.Date;

public class PretATerme implements Strategy {

	private double capital;
	private double taux;
	private Date dateDebut;
	
	
	/**
	 * Constructeur;
	 * 
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 */
	public PretATerme(double capital, double taux, Date dateDebut) {
		super();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}


	/**
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}


	/**
	 * @param capital the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}


	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}


	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}


	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}


	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	
}
