package projPOO01.GestionPersonnes;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

import ProjetPOO01.Enumerations.EFournisseur;
import projPOO01.Exceptions.ExceptionNumeroUnique;
import projPOO01.GestionAchat.Achat;
import projPOO01.GestionAchat.commande;

public class Fournisseur extends Personne implements IClient, IFournisseur {

	private int idfournisseur;
	private List<commande> commandes = new ArrayList<commande>();

	/**Constructor
	 *
	 * @param nom du fournisseur
	 * @param prenom du fournisseur
	 * @param adresse du fournisseur
	 * @param ville du fournisseur
	 * @param codepostal code postal du fournisseur
	 * @param idfournisseur id du fournisseur
	 */
	public Fournisseur(String nom, String prenom, String adresse, String ville, String codepostal, int idfournisseur) {
		super(nom, prenom, adresse, ville, codepostal);
		// TODO Auto-generated constructor stub
		this.idfournisseur = idfournisseur;
	}
	

	public Fournisseur(Dictionary<EFournisseur, String> di) {
		super(di.get(EFournisseur.nom), di.get(EFournisseur.prenom), di.get(EFournisseur.adresse), di.get(EFournisseur.ville), di.get(EFournisseur.codepostal));
		this.idfournisseur= Integer.parseInt(di.get(EFournisseur.idfournisseur));
	}

	
	
	/**Getter
	 * 
	 * @return commandes une liste des comande pass� chez le fournisseur
	 */
	public List<commande> getCommandes() {
		return commandes;
	}

	/**
	 *Override de la fonction toString de la classe m�re
	 */
	@Override
	public String toString() {
		return super.toString() + "[idfournisseur=" + idfournisseur + ", commandes=" + commandes+"]";
	}



	/**Getter
	 * 
	 * @return idfournisseur id du fournisseur
	 */
	public int getIdfournisseur() {
		return idfournisseur;
	}


	/**Setter
	 * 
	 * @param idfournisseur id du fournisseur
	 */
	public void setIdfournisseur(int idfournisseur) {
		this.idfournisseur = idfournisseur;
	}


	/**
	 *Override de la fonction achete de la classe m�re
	 *
	 *@param listachat liste d'achats
	 */
	@Override
	public void achete(List<Achat> listachat) {
		// TODO Auto-generated method stub
		System.out.println("Fournisseur achete");
	}

	/**
	 *Override de la fonction paie de la classe m�re
	 */
	@Override
	public boolean paie() {
		// TODO Auto-generated method stub
		System.out.println("Fournisseur paie");
		return true;
	}

	/**
	 *Override de la fonction livre de la classe m�re
	 */
	@Override
	public boolean livre() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 *Override de la fonction commande de la classe m�re
	 */
	@Override
	public void commande(List<commande> listcommande) {
		// TODO Auto-generated method stub
		this.commandes = listcommande;
	}


	/**
	 *Override de la fonction isClient de la classe m�re
	 */
	@Override
	public boolean isClient() {
		// TODO Auto-generated method stub
		return false;
	}


	/**
	 *Override de la fonction isFournisseur de la classe m�re
	 */
	@Override
	public boolean isFournisseur() {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**M�thode de controle de la saisie du num�ro unique du fournisseur
	 * 
	 * @param ns un num�ro sous forme de string
	 * @param list une liste de fournisseur
	 * @throws ExceptionNumeroUnique si le num�ro unique entr� en param�tre existe d�ja dans la liste de fournisseur
	 */
	public static void CtrlNumeroUniqueFournisseur(String ns, ArrayList<Fournisseur> list) throws ExceptionNumeroUnique{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
				
			
		}catch(Exception e) {
			throw new ExceptionNumeroUnique("Le numero saisi n'est pas un entier");
		}
		for(Fournisseur c1:list) 
		{
			if(n!=c1.getIdfournisseur()) {
				
			}else {
				throw new ExceptionNumeroUnique("Le numero unique est d�ja utilis�");
				
			}
		}
		
	}

}
