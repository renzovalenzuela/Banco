package M9P5;

import java.util.Comparator;

public class Estudiante implements Comparable {
	String Nombre, primerApellido;
	int IdEstudiante = 0;
	double Media = 0;
	
	public Estudiante(String peNombre, String pePrimerApellido, int peIdEstudiante, double peMedia){
		if(peNombre == null || pePrimerApellido == null || peIdEstudiante == 0 || peMedia == 0){
			throw new IllegalArgumentException();
		}
		this.Nombre = peNombre.trim();
		this.primerApellido = pePrimerApellido.trim();
		this.IdEstudiante = peIdEstudiante;
		this.Media = peMedia;
	}
	
	public String getNombre(){
		return this.Nombre.trim();
	}
	public String getPrimerApellido(){
		return this.primerApellido.trim();
	}
	public int getIdEstudiante(){
		return this.IdEstudiante;
	}
	public double getMedia(){
		return this.Media;
	}
	
	@Override
	public int compareTo(Object o) {
		double f = this.Media - ((Estudiante) o).Media;
		if(f == 0){
			return 0;
		}
		else if(f < 0){
			return -1;
		}
		else{
			return 1;
		}
	}
}
