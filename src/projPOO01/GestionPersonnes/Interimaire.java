/**
 * 
 */
package projPOO01.GestionPersonnes;

import projPOO01.Exceptions.ExceptionInt;
import projPOO01.Exceptions.ExceptionTailleString;

/**
 *
 * @author Pierre
 * @since 18/03/2020
 *
 */
public class Interimaire extends Salarie {

	/** contratAgence */
	private String contratAgence;
	
	/** dureeMois */
	private Integer dureeMois;

	/**Constructor
	 *
	 */
	public Interimaire() {
		super("", "", "", "", "", "", 0);
		this.contratAgence = "";
		this.dureeMois = 0;
	}

	/**Constructor
	 *
	 * @param nom de l'intérimaire
	 * @param prenom de l'intérimaire
	 * @param adresse de l'intérimaire
	 * @param ville de l'intérimaire
	 * @param codepostal code postal de l'intérimaire
	 * @param secu numéro de sécurité sociale de l'intérimaire
	 * @param salaire de l'intérimaire
	 * @param contratAgence numéro de l'agence de l'intérimaire
	 * @param dureeMois durée en mois du contrat de l'intérimaire
	 */
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu,
			double salaire, String contratAgence, Integer dureeMois) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.contratAgence = contratAgence;
		this.dureeMois = dureeMois;
	}
	
	/**Méthode de controle de la saisie du numéro de contrat de l'intérimaire
	 * 
	 * @param contratAgence numéro de l'agence de l'intérimaire
	 * @throws ExceptionTailleString si le numéro n'as pas assez de caractère
	 */
	public static void ctrlContratAgence(String contratAgence) throws ExceptionTailleString {
		
		if (contratAgence.length() < 5) {
			
			throw new ExceptionTailleString("Le nombre de caractère est inférieur à 5");
			
		}
		
	}
	
	/**Méthode de controle de la saisie de la durée du contrat de l'intérimaire
	 * 
	 * @param duree durée du contrat en mois
	 * @throws ExceptionInt si la durée est inférieur à 1 mois
	 */
	public static void ctrlDureeMois(Integer duree) throws ExceptionInt {
		
		if (duree <= 1) {
			
			throw new ExceptionInt("La durée ne peut ètre inférieur à 1 mois");
			
		}
		
	}

	/**Getter
	 *
	 * @return the contratAgence
	 */
	public String getContratAgence() {
		return contratAgence;
	}

	/**Setter
	 *
	 * @param contratAgence the contratAgence to set
	 */
	public void setContratAgence(String contratAgence) {
		this.contratAgence = contratAgence;
	}

	/**Getter
	 *
	 * @return the dureeMois
	 */
	public Integer getDureeMois() {
		return dureeMois;
	}

	/**Setter
	 *
	 * @param dureeMois the dureeMois to set
	 */
	public void setDureeMois(Integer dureeMois) {
		this.dureeMois = dureeMois;
	}

}
