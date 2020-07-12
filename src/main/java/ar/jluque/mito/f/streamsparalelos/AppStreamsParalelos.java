package ar.jluque.mito.f.streamsparalelos;

import java.util.ArrayList;
import java.util.List;

public class AppStreamsParalelos {

	private List<Integer> numeros;

	public void llenar() {
		numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
	}

	/**
	 * Stream secuencial. recorre el array en orden
	 */
	public void probarStream() {
		numeros.stream().forEach(System.out::println);
	}

	/**
	 * Stream asincrono, se apoya en el procesamiento por hilos. De manera implicita
	 * usa el framworkl forJoin (jdk1.7) y crea un procesamiento por hilos (no
	 * sabemos el comportamiento real, porque es aleatorio).
	 */
	public void probarStreamParalelo() {
		numeros.parallelStream().forEach(System.out::println);
	}

	public static void main(String[] args) throws InterruptedException {
		AppStreamsParalelos app = new AppStreamsParalelos();
		app.llenar();
//		app.probarStream();
		app.probarStreamParalelo();

	}
}
