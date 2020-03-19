package projPOO01.GestionAchat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class commande {
	private Date date;
	private String intitule;
	private int quantite;
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	
	/**Constructor
	 *
	 * @param d une date
	 * @param i un intitul�
	 * @param q une quantit�e
	 */
	public commande(Date d, String i, int q) {
		// TODO Auto-generated constructor stub
		this.date = d;
		this.intitule = i;
		this.quantite = q;
	}

	/**
	 *Override de la fonction toString de la classe m�re
	 */
	@Override
	public String toString() {
		return intitule + "[date=" +sd.format(date) + ", quantite=" + quantite + "]";
	}
	
	

}
