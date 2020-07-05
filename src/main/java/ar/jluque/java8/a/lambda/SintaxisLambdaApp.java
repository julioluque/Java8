package ar.jluque.java8.a.lambda;

public class SintaxisLambdaApp {

	public double probarSintaxis() {

//		Operacion op = (double a, double b) -> (a + b) / 2;
//		Operacion op = (a, b) -> (a + b) / 2;

		
//		Operacion op = (double a, double b) -> {
//			return (a + b) / 2;
//		};
//		Operacion op = (a, b) -> {
//			return (a + b) / 2;
//		};

		
//		Operacion op = (double a, double b) -> {
//			System.out.println("old A: " + a);
//			a = a + 0.2;
//			System.out.println("new A: " + a);
//			System.out.println("B value: " + b);
//			return (a + b) / 2;
//		};
		IOperacion op = (a, b) -> {
			System.out.println("old A: " + a);
			a = a + 0.2;
			System.out.println("new A: " + a);
			System.out.println("B value: " + b);
			return (a + b) / 2;
		};

		return op.calcular(2, 5);

	}

	public double SintaxisSinParametros() {
//		OperacionLibre op = () -> 2; // quitar parametros de la intefaz y la llamada
		IOperacionLibre op = () -> {
			int x = 2;
			int y = 5;
			return x - y;
		};

		return op.calcularVacio();

	}

	public static void main(String[] args) {

		SintaxisLambdaApp app = new SintaxisLambdaApp();
		System.out.println("Variaciones de sintaxis: " + app.probarSintaxis());
		System.out.println("Variacioens sin parametros: " + app.SintaxisSinParametros());

	}
}
