package testsuite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

	private BufferedWriter bw;

	public Writer(String filePath) throws FileNotFoundException {
		this.bw = new BufferedWriter(new PrintWriter(new File(filePath)));
	}

	public void write(String algorithm, long initialTime, int vectorLength) throws IOException {
		bw.write(algorithm + " " + (System.currentTimeMillis() - initialTime) + " " + vectorLength + "\n");
		bw.flush();
	}

}
