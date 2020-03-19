package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Achat;

public interface IClient {
	
	public void achete(List<Achat> listachat);

	default boolean paie() {
		return false;
	}

	default boolean isClient() {
		return false;
	}
}
