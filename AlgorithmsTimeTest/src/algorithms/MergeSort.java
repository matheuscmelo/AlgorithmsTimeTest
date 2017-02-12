package algorithms;

public class MergeSort implements Sorting {
	private final String nome = "MergeSort";
	
	public void sort(int[] v) {
		sort(v, 0, v.length - 1);
	}

	public void sort(int[] V, int ini, int fim) {
		if (ini < fim) {
			int med = (ini + fim) / 2;
			sort(V, ini, med);
			sort(V, med + 1, fim);
			merge(V, ini, med, fim);
		}
	}

	public void merge(int[] v, int ini, int med, int fim) {
		int[] aux = new int[v.length];
		for (int i = ini; i < fim; i++) {
			aux[i] = v[i];
		}
		int x = ini;
		int y = med + 1;
		int z = ini;
		while (x <= med && y <= fim) {
			if (aux[x] < aux[y]) {
				v[z++] = aux[x++];
			} else {
				v[z++] = aux[y++];
			}
		}
		while (x <= med) {
			v[z++] = aux[x++];
		}
		while (y <= fim) {
			v[z++] = aux[y++];
		}

	}
	
	
	public String toString() {
		return this.nome;
	}

}
