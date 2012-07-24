package M9P5;

import java.util.Comparator;

public class CompareNombre implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return (((Estudiante) o1).Nombre.compareTo(((Estudiante) o2).Nombre.trim()));
	}
}
