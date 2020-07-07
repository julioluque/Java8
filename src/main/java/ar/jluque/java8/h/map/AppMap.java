package ar.jluque.java8.h.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AppMap {

	private Map<Integer, String> mapa;

	private void poblar() {
		mapa = new HashMap<Integer, String>();
		mapa.put(1, "Julio");
		mapa.put(2, "Martin");
		mapa.put(3, "Julian");
		mapa.put(4, "Gaston");
	}

	private void imprimirVersion7() {
		for (Map.Entry<Integer, String> e : mapa.entrySet()) {
			System.out.println("v7 - Llave: " + e.getKey() + ", Valor: " + e.getValue());
		}
	}

	private void imprimirVersion8() {
		mapa.forEach((k, v) -> System.out.println("v8 - Llave: " + k + ", valor: " + v));

	}

	private void imprmirVersion8ConStreams() {
		mapa.entrySet().stream().forEach(x -> System.out.println(x));
	}

	public void insertarSiAusente() {
		mapa.putIfAbsent(5, "Roman");
		mapa.putIfAbsent(1, "SOBREESCRIBIR");
		mapa.entrySet().stream().forEach(System.out::println);
	}

	public void operarSiPresente() {
		mapa.computeIfPresent(3, (k, v) -> k + v);
		System.out.println(mapa.get(3));
	}

	public void obtenerPredeterminado() {
		String valor = mapa.getOrDefault(10, "valor predeterminado");
		System.out.println(valor);
	}

	public void recolectar() {
		Map<Integer, String> nuevoMapaRecolectado = mapa.entrySet().stream().filter(e -> e.getValue().contains("Jul"))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

		nuevoMapaRecolectado.forEach((k, v) -> System.out.println("clave:" + k + " // valor: " + v));
	}

	public static void main(String[] args) {
		AppMap app = new AppMap();
		app.poblar();
		app.imprimirVersion7();
		app.imprimirVersion8();
		app.imprmirVersion8ConStreams();

		System.out.println("METODO INSERTAR SI AUSENTE -----------------------");
		app.insertarSiAusente();
		System.out.println("METODO OPERAR SI PRESENTE-----------------------");
		app.operarSiPresente();
		System.out.println("METODO OBTENER PREDETERMINADO-----------------------");
		app.obtenerPredeterminado();
		System.out.println("METODO RECOLECTAR EN NUEVO MAPA-----------------------");
		app.recolectar();
	}

}
