package ar.jluque.mito.e.collections;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

public class AppColeccionesJ8 {

	private List<String> alumnos;

	public void cargarLista() {
		alumnos = new ArrayList<>();
		alumnos.add("Ruben 1");
		alumnos.add("Julio 2");
		alumnos.add("Lizeth 3");
		alumnos.add("Janeth 4");
		alumnos.add("Saturnino 5");
		alumnos.add("Ximena 6");
		alumnos.add("Reveca 7");
		alumnos.add("Ariel 8");
		imprimir();
	}

	public void imprimir() {
		System.out.println("--- Imprimiendo lista ---");
		alumnos.forEach(x -> System.out.println(x));
	}

	public void borrarUno() {
		alumnos.removeIf(x -> x.equalsIgnoreCase("Ariel 8"));
		imprimir();
	}

	public void ordenar() {
		alumnos.sort((x, y) -> x.compareTo(y));
		imprimir();
	}

	public static void main(String[] args) {
		AppColeccionesJ8 app = new AppColeccionesJ8();
//		app.cargarLista();
//		app.borrarUno();
//		app.ordenar();

		List<String> numeros = new ArrayList<>();
		numeros.add("uno");
		numeros.add("dos");
		numeros.add("tres");
		numeros.add("cuatro");
		numeros.add("cinco");
		numeros.add("seis");
		numeros.add("siete");
		numeros.add("ocho");
		System.out.println("Imprimendo lista");
		numeros.forEach(x -> System.out.println(x));
		System.out.println("Borrando elementos");
		numeros.removeIf(x -> x.equalsIgnoreCase("seis"));
		numeros.forEach(x -> System.out.println(x));
		System.out.println("Ordenando lista");
		numeros.sort((x, y) -> x.compareTo(y));
		numeros.forEach(x -> System.out.println(x));

		List<String> marcas = new ArrayList<>();
		marcas.add("Nikke");
		marcas.add("Addidas");
		marcas.add("Puma");
		marcas.add("Reebok");
		marcas.add("Converse");

		marcas.removeIf(z -> z.equalsIgnoreCase("Converse"));
		marcas.sort((x, y) -> x.compareTo(y));
		marcas.forEach(x -> System.out.println(x));
	}
}
