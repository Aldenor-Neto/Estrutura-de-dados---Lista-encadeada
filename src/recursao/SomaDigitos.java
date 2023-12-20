package recursao;

public class SomaDigitos {

	public static int somaDigitos(int n) {
		if (n < 10) {
			return n;
		} else {
			return n % 10 + somaDigitos(n / 10);
		}
	}

	public static void main(String[] args) {
		
		int a = somaDigitos(123456);
		System.out.println(a);
	}
}
