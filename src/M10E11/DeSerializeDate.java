package M10E11;

import java.io.*;
import java.util.*;

public class DeSerializeDate {

	public static void main(String[] args) {
		new DeSerializeDate();
	}
	
	public DeSerializeDate(){
		Date d = null;
		try{
			FileInputStream f = new FileInputStream("date.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			d = (Date)s.readObject();
			s.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Fecha Deserializada: " + d);
	}
}
