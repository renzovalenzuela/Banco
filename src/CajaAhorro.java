
public class CajaAhorro extends Cuenta {
	private double porcentajeInteres;
	
	public CajaAhorro(double peBalance, double pePorcentajeInteres){
		super(peBalance);
		porcentajeInteres = pePorcentajeInteres;
	}
	
	public double getInteresAcumulado(){
		return ( Balance + (Balance * (porcentajeInteres / 12)));
	}
}
