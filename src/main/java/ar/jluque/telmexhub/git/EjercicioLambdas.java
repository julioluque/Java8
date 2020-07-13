package ar.jluque.telmexhub.git;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class EjercicioLambdas {

	/**
	 * Imprimir una cadena formada de la primer letra de cada palabra en la lista
	 */
	private void ejercicio1() {
		List<String> list = Arrays.asList("Abraham", "Carlos", "Daniel", "Esteban", "Francisco", "Gustavo", "Hugo",
				"Ignacio");

		// Código aquí
		System.out.println("No modificamos la lista original ");
		StringBuilder resultado = new StringBuilder();
		list.stream().forEach(l -> resultado.append(l.charAt(0)));
		System.out.println("Resultado = " + resultado);

		System.out.println("Modificando la lista original ");
		list.stream().forEach(l -> System.out.print(l.charAt(0)));
		System.out.println();
	}

	/**
	 * Imprimir sólo las palabras de longitud par
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void ejercicio2() {
		List<String> list = new ArrayList(
				Arrays.asList("Abraham", "Carlos", "Daniel", "Esteban", "Francisco", "Gustavo", "Hugo", "Ignacio"));

		// Código aquí
		list.removeIf(p -> p.length() % 2 != 0);
		System.out.println(list);

	}

	/**
	 * Imprimir las palabras convertidas a mayúsculas
	 */
	private void ejercicio3() {
		List<String> list = Arrays.asList("Abraham", "Carlos", "Daniel", "Esteban", "Francisco", "Gustavo", "Hugo",
				"Ignacio");

		// Código aquí
		list.forEach(p -> System.out.println(p.toUpperCase()));

	}

	/**
	 * Crear un hilo que imprima los números de la lista
	 */
	private void ejercicio4() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Código aquí
		(new Thread(() -> list.forEach(System.out::println))).start();
		(new Thread(() -> list.forEach(i -> System.out.println(i)))).start();
	}

	private double ejercicio5(List<Integer> list) {
		double edades = 0;
		double cont = 0;
		for (Integer edad : list) {
			if (edad >= 21) {
				edades += edad;
				cont++;
			}
		}
		return edades / cont;
	}

	private double ejercicio6(List<Integer> list) {
		return list.stream().filter(p -> p >= 21).mapToInt(p -> p).average().orElse(0.0);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(18, 12, 13, 14, 15, 6, 17, 8, 9, 10);
		
		EjercicioLambdas el = new EjercicioLambdas();
		System.out.println("Lambdas y Stream API EjercicioLambdas");
		System.out.println("--------------- Ejercicio 1");
		el.ejercicio1();
		System.out.println("---------------Ejercicio 2");
		el.ejercicio2();
		System.out.println("---------------Ejercicio 3");
		el.ejercicio3();
		System.out.println("---------------Ejercicio 4");
		el.ejercicio4();
		System.out.println("Fin");
		
		System.out.println("---------------Ejercicio 5");
		double edad1 = el.ejercicio5(list);
		
		System.out.println(edad1);
		System.out.println("---------------Ejercicio 6");
		double edad2 = el.ejercicio6(list);
		System.out.println(edad2);

	}

}
