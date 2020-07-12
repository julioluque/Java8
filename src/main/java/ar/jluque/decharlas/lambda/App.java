package ar.jluque.decharlas.lambda;

public class App {

	public static void main(String[] args) {
		System.out.println("Inicio...");
		String nombre = "Julio: ";
		double v1 = 3.5;
		double v2 = 43.4;
		System.out.println("---------- MENSAJERIA ----------");
		IMensaje msg = (n) -> {
			System.out.println(n + "implmentando interface funcional con lambda");
			System.out.println(n + "implmentado!!!");
		};
		msg.mensaje(nombre);
		msg.menaje2();

		System.out.println("---------- CALCULADORA ----------");
		ICalculadora sumar = (x, y) -> {
			double resultado = x + y;
			System.out.println("Implementando SUMA = " + resultado);
		};
		ICalculadora restar = (x, y) -> {
			double resultado = x - y;
			System.out.println("Implementando RESTA = " + resultado);
		};
		ICalculadora multiplicar = (x, y) -> {
			double resultado = x * y;
			System.out.println("Implementando MULTIPLICACION = " + resultado);
		};
		ICalculadora dividir = (x, y) -> {
			double resultado = x / y;
			System.out.println("Implementando DIVISION = " + resultado);
		};
		ICalculadora desc = (x, y) -> System.out.println();

		desc.descripcion(v1, v2);
		sumar.operacion(v1, v2);
		restar.operacion(v1, v2);
		multiplicar.operacion(v1, v2);
		dividir.operacion(v1, v2);

	}
}
