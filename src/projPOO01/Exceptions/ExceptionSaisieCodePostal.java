package projPOO01.Exceptions;

/**Exception lancée si un numéro de code postal entrée est incorrect
 *
 * @author Pierre
 * @since 18/03/2020
 *
 */
public class ExceptionSaisieCodePostal extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionSaisieCodePostal() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisieCodePostal(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisieCodePostal(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisieCodePostal(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionSaisieCodePostal(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
