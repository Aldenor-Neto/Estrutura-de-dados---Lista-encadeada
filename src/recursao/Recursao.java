package recursao;

public class Recursao {
	public static int factorial(int numero) {
		if (numero == 1) {
			System.out.println(numero);
			return numero;
		}

		System.out.print(numero + " * ");
		return numero * factorial(numero - 1);
	}

	public static int contadorDecrescente(int numero) {
		if (numero == 1) {
			System.out.println(numero);
			return numero;
		}

		System.out.print(numero + " ");
		return contadorDecrescente(numero - 1);
	}

	public static void contadorCrescente(int numero) {
		if (numero > 0) {
			System.out.println(numero);
			contadorCrescente(numero - 1);
		}
		System.out.print(numero + " ");
	}

	public static void main(String[] args) {

		int num = factorial(5);
		System.out.println("o factorial é " + num);

		System.out.println("decrescente");
		num = contadorDecrescente(5);
		
		System.out.println("Crescente");
		contadorCrescente(5);
	}

}
