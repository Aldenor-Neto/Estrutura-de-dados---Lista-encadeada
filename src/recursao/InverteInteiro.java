package recursao;

public class InverteInteiro {

	public static int inverte(int n, int m) {
		if (n < 10) {
			return n;
		}
		return inverte(n / 10, n % 10 + 10 * m);
	}

	public static void main(String[] args) {

		int a = inverte(123456, 0);
		System.out.println(a);
	}

}
