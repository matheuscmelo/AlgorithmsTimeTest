package algorithms;

public class QuickSort implements Sorting {
	private final String nome = "QuickSort";

	public void sort(int[] elements) {
		sort(elements, 0, elements.length - 1);

	}

	public void sort(int[] v, int ini, int fim) {

		if (ini <= fim) {
			int k = particiona(v, ini, fim);
			sort(v, ini, k - 1);
			sort(v, k + 1, fim);
		}
	}

	private int particiona(int[] v, int ini, int fim) {
		int pivot = v[(ini + fim) / 2];
		int i = ini;
		int j = ini + 1;
		while (j <= fim) {
			if (v[j] < pivot) {
				i++;
				swap(v, i, j);
			}
			j += 1;
		}
		swap(v, ini, i);
		return i;

	}

	private void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;

	}

	public String toString() {
		return this.nome;
	}

}
