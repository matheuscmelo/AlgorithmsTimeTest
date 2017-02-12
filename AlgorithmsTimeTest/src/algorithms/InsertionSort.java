package algorithms;

public class InsertionSort implements Sorting {
	private final String nome = "InsertionSort";
	public void sort(int[] V) {
		for (int i = 1; i < V.length; i++) {
			int k = i;
			while (k > 0 && V[k] < V[k - 1]) {
				swap(V, k - 1, k);
				k--;
			}
		}

	}

	private void swap(int[] V, int menor, int maior) {
		int aux = V[maior];
		V[maior] = V[menor];
		V[menor] = aux;

	}
	
	public String toString() {
		return this.nome;
	}
}
