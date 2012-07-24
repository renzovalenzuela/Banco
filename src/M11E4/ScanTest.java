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
		System.out.println("Parámetro 1: " + param);
		int value = s.nextInt();
		System.out.println("Segundo parámetro: " + value);
		s.close();
	}

}
