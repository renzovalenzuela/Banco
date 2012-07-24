package M11E4;

import java.io.*;

public class WriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File(args[0]);
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			PrintWriter out = new PrintWriter(new FileWriter(file));
			String s;
			
			System.out.println("Introduzca el texto del archivo.");
			System.out.println("[Escriba ctrl-d para terminar.]");
			
			while((s = in.readLine()) != null){
				out.println(s);
			}
			in.close();
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
