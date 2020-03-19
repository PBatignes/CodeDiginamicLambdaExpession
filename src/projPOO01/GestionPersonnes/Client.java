package projPOO01.GestionPersonnes;

import java.util.ArrayList;
import java.util.List;

import projPOO01.Exceptions.ExceptionNumeroUnique;
import projPOO01.GestionAchat.Achat;
import projPOO01.GestionAchat.commande;

public class Client extends Personne implements IFournisseur, IClient {

	
	private int idclient;
	private List<Achat> achats = new ArrayList<Achat>();


	/**Constructor
	 *
	 * @param nom du client
	 * @param prenom du client
	 * @param adresse du client
	 * @param ville du client
	 * @param codepostal code postal du client
	 * @param idclient id du client
	 */
	public Client(String nom, String prenom, String adresse, String ville, String codepostal, int idclient) {
		super(nom, prenom, adresse, ville, codepostal);
		// TODO Auto-generated constructor stub
		this.idclient=idclient;
	}

	
	/**
	 *Override de la fonction toString de la classe mère
	 */
	@Override
	public String toString() {
		return super.toString() + "[idclient=" + idclient + ", achats=" + achats+"]";
	}



	/**Getter
	 * 
	 * @return idClient id du client
	 */
	public int getIdclient() {
		return idclient;
	}


	/**Getter
	 * 
	 * @return achats du client
	 */
	public List<Achat> getAchats() {
		return achats;
	}



	/**Setter
	 * 
	 * @param idclient id du client
	 */
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	/**
	 *Override de la fonction livre de la classe mère
	 */
	@Override
	public boolean livre() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 *Override de la fonction commande de la classe mère
	 *
	 *@param listcommande une liste de commande
	 */
	@Override
	public void commande(List<commande> listcommande) {
		// TODO Auto-generated method stub

	}

	/**
	 *Override de la fonction achete de la classe mère
	 *
	 *@param listachat une liste d'achats
	 */
	@Override
	public void achete(List<Achat> listachat) {
		// TODO Auto-generated method stub
		this.achats = listachat;

	}

	/**
	 *Override de la fonction paie de la classe mère
	 */
	@Override
	public boolean paie() {
		// TODO Auto-generated method stub

		return true;
	}


	/**
	 *Override de la fonction isClient de la classe mère
	 */
	@Override
	public boolean isClient() {
		// TODO Auto-generated method stub
		return true;
	}


	/**
	 *Override de la fonction isFournisseur de la classe mère
	 */
	@Override
	public boolean isFournisseur() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**Méthode de controle de la saisie du numéro unique du cient
	 * 
	 * @param ns numéro unique du client
	 * @param list	liste de client
	 * @throws ExceptionNumeroUnique si le numéro unique entrée en paramètre existe déjat dans la liste de client
	 */
	public static void CtrlNumeroUniqueClient(String ns, ArrayList<Client> list) throws ExceptionNumeroUnique{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
				
			
		}catch(Exception e) {
			throw new ExceptionNumeroUnique("Le numero saisi n'est pas un entier");
		}
		for(Client c1:list) 
		{
			if(n!=c1.getIdclient()) {
				
			}else {
				throw new ExceptionNumeroUnique("Le numero unique est déja utilisé");
				
			}
		}
		
	}

}
