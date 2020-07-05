package ar.jluque.java8.a.lambda;

public class ScopesLambdaApp {

	private static double valorEstatico;
	private double valorNormal;

	/*
	 * Cuando estoy en una expresion lambda y quiero hacer referencia a nuestros
	 * atributos de clase (Estatico o normal), tenemos la capacidad de lectura y
	 * escritura.
	 */
	public double probarAtributosVariableLocal() {

		IOperacion opAtrib = new IOperacion() {

			@Override
			public double calcular(double a, double b) {
				
				valorEstatico = a + b;
				valorNormal = valorEstatico;
				return valorNormal;
			}
		};

		IOperacion opAtribLmbd = (x, y) -> {
			valorEstatico = x + y;
			return valorNormal = valorEstatico;
		};
		
		return opAtrib.calcular(23, 25);
	}

	private double probarVariableLocal() {

		final double n = 3;

//		IOperacion op1 = new IOperacion() {
//			@Override
//			public double calcular(double a, double b) {
////				n = a + b;  -  en una clase anonima, no se modifican las variables locales.
//				return n + a + b;
//			}
//		};

		IOperacion op = (a, b) -> {
			return n + a + b;
		};

		return op.calcular(1, 1);
	}

	public static void main(String[] args) {

		ScopesLambdaApp scope = new ScopesLambdaApp();
		System.out.println("VariableLocal: " + scope.probarVariableLocal());
		System.out.println("AtributosVariableLocal: " + scope.probarAtributosVariableLocal());
	}

}
