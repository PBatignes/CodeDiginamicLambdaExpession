package projPOO01.Controles;

import java.text.SimpleDateFormat;
import java.util.Date;

import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionInt;

public class Controles {

	/**M�thode permettant de v�rifier le format de la date entr� en param�tre
	 * 
	 * @param date sous forme de String
	 * @return une date format�
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
	
	/**M�thode permettant de v�rifier que le nombre pass� en param�tre est un entier
	 * 
	 * @param ns un nombre sous forme de String
	 * @throws ExceptionInt si la string pass� en param�tre n'est pas un entier
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
