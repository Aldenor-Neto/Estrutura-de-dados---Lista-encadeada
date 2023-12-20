package recursao;

import java.util.List;

public class MenorK {

	public static List<Integer> menorK (List<Integer> vetor, List<Integer> menor, List<Integer> maior, int k) {
		if (vetor.size() == 0) {
			return menor.addAll(maior);
		} else {
			if (vetor.get(0) <= k) {
				menor.add(vetor.get(0));
			} else {
				maior.add(vetor.get(0));
			}

			vetor.remove(0);
			menorK(vetor, menor, maior, k);

		}
	}

	public static void main(String[] args) {

	}

}
