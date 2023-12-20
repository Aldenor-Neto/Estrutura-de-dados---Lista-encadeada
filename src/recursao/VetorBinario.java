package recursao;

public class VetorBinario {

	public static boolean vetorBinario(int[] vetor, int alvo, int prim, int ultim) {
		int medio = (ultim + prim) / 2;
		if (vetor[medio] == alvo) {
			return true;
		}
		if (ultim < prim) {
			return false;
		} else {
			if (alvo < vetor[medio]) {
				return vetorBinario(vetor, alvo, prim, medio - 1);
			} else {
				return vetorBinario(vetor, alvo, medio + 1, ultim);
			}
		}

	}

	public static void main(String[] args) {

		int[] vet = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(vetorBinario(vet, 55, 0, 9));
	}

}
