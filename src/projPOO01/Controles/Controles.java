package projPOO01.Controles;

import java.text.SimpleDateFormat;
import java.util.Date;

import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionInt;

public class Controles {

	/**Méthode permettant de vérifier le format de la date entré en paramètre
	 * 
	 * @param date sous forme de String
	 * @return une date formaté
	 * @throws ExceptionDate si le format de la date saisie est incorrect
	 */
	public static Date CtrlDate(String d) throws ExceptionDate {
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		sd.setLenient(false);
		Date dt = new Date();
		try {
			dt =sd.parse(d);
			
		}catch(Exception e) {
			throw new ExceptionDate("Mauvais format de date saisi");
		}
		return dt;
	}
	
	/**Méthode permettant de vérifier que le nombre passé en paramètre est un entier
	 * 
	 * @param ns un nombre sous forme de String
	 * @throws ExceptionInt si la string passé en paramètre n'est pas un entier
	 */
	public static void CtrlInt(String ns) throws ExceptionInt{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
		}catch(Exception e) {
			throw new ExceptionInt("Veuillez saisir un entier");
		}
		
		}
	
}
