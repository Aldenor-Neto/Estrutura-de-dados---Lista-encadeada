package recursao;

public class SomaElementos {

	public static boolean somaElementos(int[] vetor, int k, int prim, int ultim) {
		if (ultim < prim) {
			return false;
		}
		if ((vetor[prim] + vetor[ultim]) == k) {
			return true;
		}
		if ((vetor[prim] + vetor[ultim]) < k) {
			return somaElementos(vetor, k, prim + 1, ultim);
		} else {
			return somaElementos(vetor, k, prim, ultim - 1);
		}
	}

	public static void main(String[] args) {

		int[] vet = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(somaElementos(vet, 20, 0, 9));
	}

}
