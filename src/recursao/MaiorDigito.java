package recursao;

public class MaiorDigito {

	public static int maiorDigito(int n) {
		if (n < 10) {
			return n;
		} else {
			int digito = maiorDigito(n/10);
			
			if (digito > n%10) {
				return digito;
			} else {
				return n%10;
			}
		}
	}

	public static void main(String[] args) {

		int a = maiorDigito(23548901);
		System.out.println(a);
	}
}