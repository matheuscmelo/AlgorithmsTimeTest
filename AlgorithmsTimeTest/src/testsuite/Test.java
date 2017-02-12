package testsuite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import algorithms.Sorting;

public class Test {
	private Writer writer;
	private List<Sorting> algorithms;
	
	public Test(String filePath) throws FileNotFoundException {
		this.writer = new Writer(filePath);
		algorithms = new ArrayList<>();
		initializeAlgorithms();
		
	}

	private void initializeAlgorithms() {
		algorithms.add(new SelectionSort());
		algorithms.add(new QuickSort());
		algorithms.add(new MergeSort());
		algorithms.add(new InsertionSort());
	}
	
	public void test() throws IOException {
		for (Sorting algorithm : algorithms) {
			for (int j = 20000; j <= 40000; j += 1000) {
				int[] v = new int[j];
				fillArray(v);
				test(algorithm, v);
			}
		}
	}
	
	private void test(Sorting algorithm, int[] v) throws IOException {
		long initialTime = System.currentTimeMillis();
		algorithm.sort(v);
		writer.write(algorithm.toString(), initialTime, v.length);
	}

	private static void fillArray(int[] v) {
		Random rand = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt();
		}
	}
	
}
