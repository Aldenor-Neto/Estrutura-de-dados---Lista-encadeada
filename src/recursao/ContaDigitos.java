package recursao;

public class ContaDigitos {

	public static int contaDigitos(int n) {
		if (n < 10) {
			return 1;
		} else {
			return 1 + contaDigitos(n / 10);
		}
	}

	public static void main(String[] args) {

		int a = contaDigitos(9873654);
		System.out.println(a);
	}

}
