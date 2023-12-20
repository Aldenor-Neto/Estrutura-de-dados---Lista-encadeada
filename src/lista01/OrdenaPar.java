package lista01;

import java.util.ArrayList;

public class OrdenaPar {

	public static ArrayList<Integer> ordenaPar(ArrayList<Integer> lista) {
		int cont = 0;
		while (cont <= lista.size()) {
			if (lista.get(cont) % 2 == 0) {
				cont++;
			} else {
				int aux =lista.get(cont) ;
						lista.remove(cont);
				lista.add(aux);
				cont++;
			}
		}
		return lista;
	}

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			lista.add(i);
		}
		ordenaPar(lista);
		System.out.println(lista);

	}

}
