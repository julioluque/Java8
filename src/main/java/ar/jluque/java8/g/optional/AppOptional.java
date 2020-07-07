package ar.jluque.java8.g.optional;

import java.util.Optional;

/**
 * @author Alfredo
 *
 */
public class AppOptional {

	/**
	 * Prueba basica de capturar un nullPointerException con una sentencia
	 * try/catch. Usamos optional definiendo el valor ingresado como vacio.
	 * 
	 * @param valor
	 */
	public void probar(String valor) {
		try {
			Optional op = Optional.empty();
			Object x = op.get();
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("No hay elemento");
		}
	}

	/**
	 * Misma situacion que metodo probar.
	 * 
	 * @param valor: Si es null, es predeterminado por try/catch o ofNullable
	 */
	public void orElse(String valor) {

		try {
			Optional<String> op = Optional.of(valor);
			String x = op.get();
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("No hay elemeno ORELSE");
		}

		System.out.println("-----------------------");

		Optional<String> opNull = Optional.ofNullable(valor);
		String y = opNull.orElse("PREDETERMINADO");
		System.out.println(y);

	}

	/**
	 * Lanzamos una excepcion para poder caputarla. Controlamos el caso de
	 * nullPointerException.
	 * 
	 * @param valor
	 */
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(ArithmeticException::new);
	}

	/**
	 * Controlamos con true o false si el valor es nulo
	 * 
	 * @param valor
	 */
	public void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}

	public static void main(String[] args) {
		AppOptional app = new AppOptional();
//		app.probar(null);
//		app.orElse("juuuulio");
//		app.orElseThrow(null);
		app.isPresent("Juuu");
	}
}
