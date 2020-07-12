package ar.jluque.mito.e.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AppCollections {

	private List<String> lista;

	public void llenarLista() {
		lista = new ArrayList<String>();
		lista.add("Delfina");
		lista.add("Sofia");
		lista.add("Luque");
		lista.add("Ortiz");
	}

	public void usarImprimirForEach() {
		System.out.println("----- forEach -----");
//		System.out.println("------- JDK 1.7");
//		for (String elemento : lista) {
//			System.out.println(elemento);
//		}
//		System.out.println("------- JDK 1.8");
//		lista.forEach(x -> System.out.println(x)); // EXPRESION LAMBDA
		lista.forEach(System.out::println); // REFERENCIAS A METODOS
	}

	public void usarRemoveIf() {
		System.out.println("----- removeIf -----");
//		for (String elemento : lista) {
//			if (elemento.equalsIgnoreCase("Luque")) {
//				lista.remove(elemento);
//			}
//		}

		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			if (it.next().equalsIgnoreCase("Ortiz")) {
				it.remove();
			}
		}

		lista.removeIf(x -> x.equalsIgnoreCase(x));
	}

	public void usarSort() {
//		Collections.sort(lista);
		lista.sort((x, y) -> x.compareTo(y));
	}

	public static void main(String[] args) {
		AppCollections app = new AppCollections();
		app.llenarLista();
		app.usarSort();
		app.usarImprimirForEach();
		app.usarRemoveIf();
		app.usarImprimirForEach();
	}
}
