package testsuite;

import java.io.FileNotFoundException;

public class Main {

	public static final String FILE_PATH = "testes.txt";

	public static void main(String[] args) {
		
		try {
			new Test(FILE_PATH).test();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
	}

}
