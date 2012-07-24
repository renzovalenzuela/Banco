package M11E4;

import java.io.*;

public class KeyboardInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("Unix: Escriba ctrl-d para salir.\nWindows: Escriba ctrl-z para salir.");
		try{
			/*s = in.readLine();
			while(s != null){
				System.out.println("Leer: " + s);
				s = in.readLine();
			}*/
			
			while ((s = in.readLine()) != null){
				System.out.println("Leer: " + s);
			}
			
			in.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
