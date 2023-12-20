package recursao;

public class ContaVogal {
	public static boolean contaVogalAux(String str, int qtdVogal, int qtdCons) {

		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		if (str.length() == 0) {
			return qtdVogal > qtdCons;
		}

		char primeiroCaracter = str.charAt(0);
		if (new String(vogais).indexOf(primeiroCaracter) != -1) {
			return contaVogalAux(str.substring(1), qtdVogal + 1, qtdCons);
		}
		return contaVogalAux(str.substring(1), qtdVogal, qtdCons + 1);
	}

	public static boolean contaVogal(String str) {
		return contaVogalAux(str, 0, 0);
	}

	public static void main(String[] args) {

		System.out.println(contaVogal("uchoa"));
	}

}
