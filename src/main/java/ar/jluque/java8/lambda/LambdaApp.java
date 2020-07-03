package ar.jluque.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("luque");
		lista.add("julio");
		lista.add("ticona");
		lista.add("alfredo");

		LambdaApp app = new LambdaApp();
		app.ordenar(lista);
		app.calcular(4, 3);

	}

	
//		JDK 1.7 
	public void calcular(double n1, double n2) {
		Operacion op = new Operacion() {
			@Override
			public double calcularPromedio(double a, double b) {
				return (a + b) / 2;
			}
		};
		System.out.println(op.calcularPromedio(n1, n2));
	}

//		JDK 1.8 -> EXPRESION LAMBDA 
	public void calcularLambda(double n1, double n2) {
		Operacion op = (double a, double b) -> (a + b) / 2;
		System.out.println(op.calcularPromedio(n1, n2));
	}

//	-----------------------------------------------------------------------------	
//	JDK 1.7 
	public void ordenar(List<String> lista) {
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

//	JDK 1.8 -> EXPRESION LAMBDA
	public void ordenarLambda(List<String> lista) {
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		lista.forEach((String elemento) -> System.out.println(elemento));
	}

	
	
}
