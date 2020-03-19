package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.commande;

public interface IFournisseur {
	default boolean livre() {
		return false;
	}

	public void commande(List<commande> listcommande);

	default boolean isFournisseur() {
		return true;
	}
}
