package projPOO01.GestionPersonnes;

public class Patron extends Salarie implements IPatron {
	

	
	/**Constructor
	 *
	 */
	public Patron() {
		super("","","","","","",0);
	}
	
	/**Constructor
	 *
	 * @param nom du patron
	 * @param prenom du patron
	 * @param adresse du patron
	 * @param ville du patron
	 * @param codepostal code postal du patron
	 * @param secu numéro de sécurité social du patron
	 * @param salaire du patron
	 */
	public Patron(String nom, String prenom, String adresse, String ville, String codepostal, String secu,
			double salaire) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 *Override de la fonction embauche de la classe mère
	 */
	@Override
	public void embauche() {
		// TODO Auto-generated method stub

	}

	/**
	 *Override de la fonction licencie de la classe mère
	 */
	@Override
	public void licencie() {
		// TODO Auto-generated method stub

	}

	/**
	 *Override de la fonction paieSalarie de la classe mère
	 */
	@Override
	public void paieSalarie() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
