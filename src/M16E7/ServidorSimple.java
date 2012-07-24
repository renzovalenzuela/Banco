package M16E7;

import java.net.*;
import java.io.*;

public class ServidorSimple {
	public static void main(String[] args) {
		ServerSocket s = null;
		
		try{
			s = new ServerSocket(5050);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		while(true){
			try{
				Socket s1 = s.accept();
				OutputStream slout = s1.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(slout));
				bw.write("Bienvenido a la red");
				
				bw.close();
				s1.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
