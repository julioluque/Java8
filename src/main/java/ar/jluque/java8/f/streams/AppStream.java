package ar.jluque.java8.f.streams;

import java.util.ArrayList;
import java.util.List;

public class AppStream {

	private List<String> lista;
	private List<String> numeros;

	public AppStream() {
		lista = new ArrayList<>();
		lista.add("Julio");
		lista.add("Alfredo");
		lista.add("Luque");
		lista.add("Ticona");

		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
		numeros.add("5");
	}

	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("L")).forEach(x -> System.out.println(x));
		numeros.stream().filter(x -> x.contains("o")).forEach(x -> System.out.println(x));
	}

	public void ordenar() {
		lista.stream().sorted().forEach(System.out::println);
		numeros.stream().sorted().forEach(System.out::println);
	}

	public void transformar() {
		lista.stream().map(String::toUpperCase).forEach(System.out::println);

		for (String num : numeros) {
			int n = Integer.parseInt(num) + 100;
			System.out.println(n);
		}

		numeros.stream().map(x -> Integer.parseInt(x) + 10000).forEach(System.out::println);
	}

	public void limitar() {
		lista.stream().limit(3).forEach(System.out::println);
	}

	public void contar() {
		long x = numeros.stream().count();
		System.out.println(x);

	}

	public static void main(String[] args) {
		AppStream app = new AppStream();
//		app.filtrar();
//		app.ordenar();
//		app.transformar();
//		app.limitar();
		app.contar();
	}
}
