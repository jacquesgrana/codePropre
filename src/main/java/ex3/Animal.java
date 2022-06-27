package ex3;

public class Animal {

	private String type;
	private String nom;
	private String comportement;
	
	/**
	 * Constructeur. 
	 * 
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Animal(String nom, String type, String comportement) {
		//super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
}
