package projPOO01.Exceptions;

/**ExceptionDate est utilis� dans le cas o� le format de date fournis par l'utilisateur n'est pas conforme au format
 * necessaire � l'ex�cution de l'application
 *
 * @author Pierre
 * @since 18/03/2020
 *
 */
public class ExceptionDate extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionDate() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionDate(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ExceptionDate(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ExceptionDate(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ExceptionDate(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
