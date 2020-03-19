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
	 * @param nom du salarié
	 * @param prenom du salarié
	 * @param adresse du salarié
	 * @param ville du salarié
	 * @param codepostal code postal du salarié
	 * @param secu numéro de sécurité social du salarié
	 * @param salaire du salarié
	 */
	public Salarie(String nom, String prenom, String adresse, String ville, String codepostal, String secu, double salaire) {
		super(nom, prenom, adresse, ville, codepostal);
		// TODO Auto-generated constructor stub
		this.salaire = salaire;
		this.secu = secu;
	}
	
	
	/**
	 *Override de la fonction toString de la classe mère
	 */
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return super.toString()+ " [secu=" + secu + ", salaire=" + df.format(salaire) + "]";
	}

	/**
	 *Override de la fonction achete de la classe mère
	 */
	@Override
	public void achete(List<Achat> listachat) {
		// TODO Auto-generated method stub

	}

	/**
	 *Override de la fonction paie de la classe mère
	 */
	@Override
	public boolean paie() {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**Méthode de controle de la saisie du numéro de sécurité social
	 * 
	 * @param ns numéro de sécu sous forme de string
	 * @throws ExceptionSaisiNumeroSecu si le numéro saisi :
	 * 	-N'as pas le bon nombre de caratère
	 * 	-Le numéro saisie ne contiens pas que des chiffre
	 */
	public static void CtrlSaisiNumeroSecu(String ns) throws ExceptionSaisiNumeroSecu{
		if(ns.length()!=13) {
			throw new ExceptionSaisiNumeroSecu("Le nombre de caractère est différents de 13");
		}
		try {
			Long.parseLong(ns);
		}catch(Exception e) {
			throw new ExceptionSaisiNumeroSecu("Il faut saisir uniquement des chiffres");
		}
	}


	/**
	 *Override de la fonction isClient de la classe mère
	 */
	@Override
	public boolean isClient() {
		// TODO Auto-generated method stub
		return false;
	}


	/**Getter
	 * 
	 * @return le numéro de sécu
	 */
	public String getSecu() {
		return secu;
	}


	/**Setter
	 * 
	 * @param secu le numéro de sécu
	 */
	public void setSecu(String secu) {
		this.secu = secu;
	}


	/**Getter
	 * 
	 * @return le salaire du salarié
	 */
	public double getSalaire() {
		return salaire;
	}


	/**Setter
	 * 
	 * @param salaire du salarié
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
