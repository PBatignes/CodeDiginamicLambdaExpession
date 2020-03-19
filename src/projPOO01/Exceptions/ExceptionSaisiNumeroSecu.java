package projPOO01.Exceptions;

/**Exception lancée si le numéro de sécu est incorrect :
 * 	-Trop ou pas assez de caractères
 * 	-Contiens pas que des chiffres
 *
 * @author Pierre
 * @since 18/03/2020
 *
 */
public class ExceptionSaisiNumeroSecu extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionSaisiNumeroSecu() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisiNumeroSecu(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisiNumeroSecu(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisiNumeroSecu(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisiNumeroSecu(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
