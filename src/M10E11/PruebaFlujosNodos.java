package M10E11;

import java.io.*;

public class PruebaFlujosNodos {
	public static void main(String[] args) {
		try{
			FileReader input = new FileReader(args[0].trim());
			BufferedReader bufInput = new BufferedReader(input);
			try{
				FileWriter output = new FileWriter(args[1].trim());
				BufferedWriter bufOutput = new BufferedWriter(output);
				try{
					//char []buffer = new char[128];
					//int charsRead;
					//charsRead = input.read(buffer);
					String line;
					line = bufInput.readLine();
					while(line != null){ //(charsRead != -1){
						//output.write(buffer,0,charsRead);
						//charsRead = input.read(buffer);
						bufOutput.write(line,0,line.length());
						bufOutput.newLine();
						line = bufInput.readLine();
					}
				}
				finally{
					//output.close();
					bufOutput.close();
				}
			}
			finally{
				//input.close();
				bufInput.close();
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
