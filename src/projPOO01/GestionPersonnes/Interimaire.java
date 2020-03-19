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
	 * @param nom de l'int�rimaire
	 * @param prenom de l'int�rimaire
	 * @param adresse de l'int�rimaire
	 * @param ville de l'int�rimaire
	 * @param codepostal code postal de l'int�rimaire
	 * @param secu num�ro de s�curit� sociale de l'int�rimaire
	 * @param salaire de l'int�rimaire
	 * @param contratAgence num�ro de l'agence de l'int�rimaire
	 * @param dureeMois dur�e en mois du contrat de l'int�rimaire
	 */
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu,
			double salaire, String contratAgence, Integer dureeMois) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.contratAgence = contratAgence;
		this.dureeMois = dureeMois;
	}
	
	/**M�thode de controle de la saisie du num�ro de contrat de l'int�rimaire
	 * 
	 * @param contratAgence num�ro de l'agence de l'int�rimaire
	 * @throws ExceptionTailleString si le num�ro n'as pas assez de caract�re
	 */
	public static void ctrlContratAgence(String contratAgence) throws ExceptionTailleString {
		
		if (contratAgence.length() < 5) {
			
			throw new ExceptionTailleString("Le nombre de caract�re est inf�rieur � 5");
			
		}
		
	}
	
	/**M�thode de controle de la saisie de la dur�e du contrat de l'int�rimaire
	 * 
	 * @param duree dur�e du contrat en mois
	 * @throws ExceptionInt si la dur�e est inf�rieur � 1 mois
	 */
	public static void ctrlDureeMois(Integer duree) throws ExceptionInt {
		
		if (duree <= 1) {
			
			throw new ExceptionInt("La dur�e ne peut �tre inf�rieur � 1 mois");
			
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
