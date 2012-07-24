package M10E11;

import java.io.*;
import java.util.*;

public class SerializeDate {

	public static void main(String[] args) {
		new SerializeDate();
	}
	
	public SerializeDate(){
		Date d = new Date();
		try{
			FileOutputStream f = new FileOutputStream("date.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(d);
			s.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
