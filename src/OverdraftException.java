
public class OverdraftException extends Exception {
	private static final long serialVersionUID = 7675627449135585909L;
	private final double deficit;
	
	public double getDeficit(){
		return this.deficit;
	}
	public OverdraftException(String peMensaje, double peDeficit){
		super(peMensaje.trim());
		this.deficit = peDeficit;
	}
}
