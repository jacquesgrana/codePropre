package ex1;

/**
 * Classe contenant deux méthodes. 
 * @author jacques
 */
public class Calcul {

	/**
	 * Méthode qui retourne la somme des int en paramètre. 
	 * @param a int ; valeur à additionner, 
	 * @param b int ; valeur à additionner, 
	 * @return int : somme des paramètres. 
	 */
	public int getAddition(int a, int b){
		return a+b;
	}
	
	/**
	 * Méthode qui retourne la soustraction du 1e paramètre par le 2e. .
	 * @param a int : premier paramètre à soustraire, 
	 * @param b int : deuxième paramètre à soustraire, 
	 * @return int : soustraction du 1e paramètre par le 2e.
	 */
	public int getSoustraction(int a, int b){
		return a-b;
	}
}