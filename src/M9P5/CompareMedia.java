package M9P5;

import java.util.Comparator;

public class CompareMedia implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		if(((Estudiante) o1).Media ==((Estudiante) o2).Media){
			return 0;
		}
		else if(((Estudiante) o1).Media < ((Estudiante) o2).Media){
			return -1;
		}
		else{
			return 0;
		}
	}
}
