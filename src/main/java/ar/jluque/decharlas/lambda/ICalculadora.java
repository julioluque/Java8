package ar.jluque.decharlas.lambda;

public interface ICalculadora {

	void operacion(double a, double b);

	default void descripcion(double a, double b) {
		System.out.println("Metodo por defecto: Se recicieron los valores: " + a + " y " + b);
	}
}
