package projPOO01.Exceptions;

/**Exception lanc�e si l'utilisateur r�utilise un num�ro unique
 *
 * @author Pierre
 * @since 18/03/2020
 *
 */
public class ExceptionNumeroUnique extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionNumeroUnique() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionNumeroUnique(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExceptionNumeroUnique(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionNumeroUnique(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionNumeroUnique(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
