package opet.aulatds171a.exceptions;

public class SaldoInsuficienteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7890962037181301498L;

	public SaldoInsuficienteException() {
		super("Saldo insuficiente!");
	}
	
	public SaldoInsuficienteException(String message) {
		super(message);
	}

}
