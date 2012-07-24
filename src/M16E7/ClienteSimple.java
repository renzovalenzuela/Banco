package M16E7;

import java.net.*;
import java.io.*;

public class ClienteSimple {

	public static void main(String[] args) {
		try{
			Socket s1 = new Socket("localhost",5050);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readLine());
			dis.close();
			is.close();
			s1.close();
		}
		catch(ConnectException e){
			System.err.println("Imposible conectar.");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
