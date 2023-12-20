package recursao;

public class MenorDigito {

	public static int menorDigito(int n) {
		if (n < 10) {
			return n;
		} else {
			int digito = menorDigito(n / 10);

			if (digito < n % 10) {
				return digito;
			} else {
				return n % 10;
			}
		}
	}

	public static void main(String[] args) {

		int a = menorDigito(9870254);
		System.out.println(a);
	}

}
