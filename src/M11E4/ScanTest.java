package M11E4;

import java.io.*;
import java.util.Scanner;

public class ScanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String param = s.next();
		System.out.println("Par�metro 1: " + param);
		int value = s.nextInt();
		System.out.println("Segundo par�metro: " + value);
		s.close();
	}

}
