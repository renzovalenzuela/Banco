package M9P5;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator c = new CompareMedia();
		Comparator c1 = new CompareNombre();
		TreeSet estudianteSet = new TreeSet(c1);
		estudianteSet.add(new Estudiante("Miguel", "Herraiz", 101, 4));
		estudianteSet.add(new Estudiante("Juan", "Lino", 102, 2.8));
		estudianteSet.add(new Estudiante("Jaime", "Marcos", 103, 3.6));
		estudianteSet.add(new Estudiante("Clara", "Genio", 104, 2.3));
		Object[] estudianteArray = estudianteSet.toArray();
		Estudiante s;
		for(Object obj : estudianteArray){
			s = (Estudiante)obj;
			System.out.printf("Nombre: %s, %s - ID: %d - Media: %.1f\n",s.Nombre.trim(),s.primerApellido.trim(),s.IdEstudiante,s.Media);
		}
	}

}
