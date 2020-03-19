/**
 * 
 */
package projPOO01.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Pierre
 * @since 19/03/2020
 *
 */
public class DatesTest {
	
	public static void main(String[] args) {
		
		//Afficher la date et l'heure au format de la France
		//sans expression lambda
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		//avec expression lambda
		//??????????
		
		
	}

}
