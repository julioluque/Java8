package ar.jluque.java8.g.optional;

import java.net.SocketTimeoutException;
import java.util.Optional;

public class AppMiOptional {

	public void usoMetodosOptional(String valor, String vacio) {

		System.out.println("1. Usando tryCatch ------------------- ");
		try {
			Optional<String> opVacio = Optional.empty();
			opVacio.get();
		} catch (Exception e) {
			System.out.println("Uso basico con valor vacio indicado en el metodo");
		}

		System.out.println("1. caputarndo valor, sin capturar posibles errores");
		Optional<String> opIf = Optional.of(valor);
		String texto = opIf.get();
		System.out.println(texto);

		System.out.println("2. Reemplazando try/catch ------------------- ");
		Optional<String> opElse = Optional.ofNullable(valor);
		String sinValor = opElse.orElse("Valor vacio predeterminado");
		System.out.println(sinValor);

		System.out.println("3. Lanzando excepciones de un valor nulo ------------------- ");
		Optional<String> opThrow = Optional.ofNullable(vacio);
		opThrow.orElseThrow(ArithmeticException::new);

		System.out.println("4. Revisando existencia con booleanos ------------------- ");
		Optional<String> opBoleano = Optional.ofNullable(vacio);
		System.out.println(opBoleano.isPresent());
	}

	public static void main(String[] args) {

		AppMiOptional op = new AppMiOptional();
		try {
		op.usoMetodosOptional("Juulio", null);
		} catch (Exception e) {
			System.out.println("???");
		}
	}
}
