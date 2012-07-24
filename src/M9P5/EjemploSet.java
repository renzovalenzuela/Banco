package M9P5;

import java.util.*;

public class EjemploSet {
	public static void main(String[] args) {
		//Set auxSet = new HashSet();
		List auxSet = new ArrayList();
		auxSet.add("Uno");
		auxSet.add("Segundo");
		auxSet.add("3ro");
		auxSet.add(new Integer(4));
		auxSet.add(new Float(5.0F));
		auxSet.add("Segundo");
		auxSet.add(new Integer(4));
		//System.out.println(auxSet);
		
		Map auxMap = new HashMap();
		auxMap.put("Primero","1ro");
		auxMap.put("Segundo",new Integer(2));
		auxMap.put("Tercero","3ro");
		auxMap.put("Tercero","III");
		Set set1 = auxMap.keySet();
		Collection auxCollection = auxMap.values();
		Set set2 = auxMap.entrySet();
		System.out.println(set1 + "\n" + auxCollection + "\n" + set2);
	}
}
