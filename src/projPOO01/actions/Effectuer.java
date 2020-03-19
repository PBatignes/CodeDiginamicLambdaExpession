package projPOO01.actions;

import java.util.List;

import projPOO01.GestionAchat.Achat;
import projPOO01.GestionAchat.commande;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.IFournisseur;
import projPOO01.Menu.Menus;
import projPOO01.saisie.Saisir;

/**
 *
 * @author Pierre
 * @since 18/03/2020
 *
 */
public class Effectuer {
	
	/**Méthode permettant d'effectuer l'achat de la commande d'un client au fournisseur
	 * 
	 */
	public static void EffectuerAchat() {
		Regrouper.RegrouperIClient();
		IClient client = Choisir.ChoisirIClient(Regrouper.listeclient);
		List<Achat> a = Saisir.SaisirAchat();
		client.achete(a);
		client.paie();
		Menus.Menu();	
	}
	
	
	/**Méthode permettant d'effecture la commande du client
	 * 
	 */
	public static void EffectuerCommande() {
		Regrouper.RegrouperIFournisseur();
		IFournisseur f = Choisir.ChoisirIFournisseur(Regrouper.listifournisseur);
		List<commande> c = Saisir.SaisirCommande();
		f.commande(c);
		f.livre();
		Menus.Menu();	
	}
}
