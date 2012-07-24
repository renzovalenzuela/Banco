package M11E4;

import java.io.*;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File(args[0]);
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			
			try{
				s = in.readLine();
				while(s != null){
					System.out.println("Lectura: " + s);
					s = in.readLine();
				}
			}
			finally{
				in.close();
			}
		}
		catch(FileNotFoundException e1){
			System.err.println("Archivo no encontrado: " + file);
		}
		catch(IOException e2){
			e2.printStackTrace();
		}
	}

}
