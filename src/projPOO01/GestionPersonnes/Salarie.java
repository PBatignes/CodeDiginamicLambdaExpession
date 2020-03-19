package projPOO01.GestionPersonnes;

import java.text.DecimalFormat;
import java.util.List;

import projPOO01.Exceptions.ExceptionSaisiNumeroSecu;
import projPOO01.GestionAchat.Achat;

public class Salarie extends Personne implements IClient{

	private String secu;
	private double salaire;

	/**Constructor
	 *
	 * @param nom du salari�
	 * @param prenom du salari�
	 * @param adresse du salari�
	 * @param ville du salari�
	 * @param codepostal code postal du salari�
	 * @param secu num�ro de s�curit� social du salari�
	 * @param salaire du salari�
	 */
	public Salarie(String nom, String prenom, String adresse, String ville, String codepostal, String secu, double salaire) {
		super(nom, prenom, adresse, ville, codepostal);
		// TODO Auto-generated constructor stub
		this.salaire = salaire;
		this.secu = secu;
	}
	
	
	/**
	 *Override de la fonction toString de la classe m�re
	 */
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return super.toString()+ " [secu=" + secu + ", salaire=" + df.format(salaire) + "]";
	}

	/**
	 *Override de la fonction achete de la classe m�re
	 */
	@Override
	public void achete(List<Achat> listachat) {
		// TODO Auto-generated method stub

	}

	/**
	 *Override de la fonction paie de la classe m�re
	 */
	@Override
	public boolean paie() {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**M�thode de controle de la saisie du num�ro de s�curit� social
	 * 
	 * @param ns num�ro de s�cu sous forme de string
	 * @throws ExceptionSaisiNumeroSecu si le num�ro saisi :
	 * 	-N'as pas le bon nombre de carat�re
	 * 	-Le num�ro saisie ne contiens pas que des chiffre
	 */
	public static void CtrlSaisiNumeroSecu(String ns) throws ExceptionSaisiNumeroSecu{
		if(ns.length()!=13) {
			throw new ExceptionSaisiNumeroSecu("Le nombre de caract�re est diff�rents de 13");
		}
		try {
			Long.parseLong(ns);
		}catch(Exception e) {
			throw new ExceptionSaisiNumeroSecu("Il faut saisir uniquement des chiffres");
		}
	}


	/**
	 *Override de la fonction isClient de la classe m�re
	 */
	@Override
	public boolean isClient() {
		// TODO Auto-generated method stub
		return false;
	}


	/**Getter
	 * 
	 * @return le num�ro de s�cu
	 */
	public String getSecu() {
		return secu;
	}


	/**Setter
	 * 
	 * @param secu le num�ro de s�cu
	 */
	public void setSecu(String secu) {
		this.secu = secu;
	}


	/**Getter
	 * 
	 * @return le salaire du salari�
	 */
	public double getSalaire() {
		return salaire;
	}


	/**Setter
	 * 
	 * @param salaire du salari�
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
