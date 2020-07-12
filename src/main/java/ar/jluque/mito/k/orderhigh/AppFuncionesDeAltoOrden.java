package ar.jluque.mito.k.orderhigh;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppFuncionesDeAltoOrden {

	private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
	private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

	public void imprimir(Function<String, String> funcion, String valor) {
		System.out.println(funcion.apply(valor));
	}

	public Function<String, String> mostrar(String mensaje) {
		return (String x) -> mensaje + x;
	}

	public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud) {
		lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
	}

	private Predicate<String> establecerLogicaFiltro(int longitud) {
		return texto -> texto.length() < longitud;
	}

	public static void main(String[] args) {

		AppFuncionesDeAltoOrden app = new AppFuncionesDeAltoOrden();
		app.imprimir(app.convertirMinusculas, "Julio Alfredo");
		app.imprimir(app.convertirMayusculas, "Luque Ticona");

		String respuesta = app.mostrar("Hola, ").apply(" julio.a.luque@gmail.com");
		System.out.println(respuesta);

		List<String> lista = new ArrayList<>();
		lista.add("Delfina");
		lista.add("Sofia");
		lista.add("Luque");
		lista.add("Ortiz");
		
		app.filtrar(lista, System.out::println, 5);
	}
}
