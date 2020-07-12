package ar.jluque.decharlas.lambda;

@FunctionalInterface
public interface IMensaje {

	void mensaje(String texto);

	default void menaje2() {
		System.out.println("Mensaje por defecto escrita en la interfaz");
	}

}
