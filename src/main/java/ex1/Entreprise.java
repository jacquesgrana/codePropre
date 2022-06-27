package ex1;

import java.util.Date;

/**
 * Classe représentant une entreprise. 
 * @author jacques
 */
public class Entreprise {
	
	/**
	 * Constante définissant le capital maximum de l'entreprise. 
	 */
	private static final int CAPITAL_MAX = 3000000;
	
	/**
	 * int : numéro de siret de l'entreprise. 
	 */
	private int siret;
	
	/**
	 * String : nom de l'entreprise. 
	 */
	private String nom;
	
	/**
	 * String : adresse de l'entreprise. 
	 */
	private String adresse;
	
	/**
	 * Date : date de création de l'entreprise. 
	 */
	private Date dateCreation;
	
	/**
	 * Méthode qui affiche le statut?
	 */
	public void Afficher_statut(){
		
	}

	/** 
	 * Getter. 
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter. 
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** 
	 * Getter. 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter. 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter. 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter. 
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** 
	 * Getter. 
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter. 
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Getter. 
	 * @return the capitalMax
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
}