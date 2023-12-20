package recursao;

public class ZeraPar {
	public static int zeraPar(int n) {
		if (n < 10) {
			if (n % 2 == 0) {
				return n = 0;
			} else {
				return n;
			}
		} else {
			if ((n % 10) % 2 == 0) {
				return 10 * zeraPar(n / 10);
			} else {
				return n%10 + 10 * zeraPar(n/10);
			}
		}
	}

	public static void main(String[] args) {

		int a = zeraPar(123456);
		System.out.println(a);
	}

}
