package ar.jluque.mito.d.referencemethods;

import java.util.Arrays;
import java.util.Comparator;

public class AppReferenciarMetodos {

	/**
	 * Metodo de acceso, Operar()
	 */
	public static void metodoEstatico() {
		System.out.println("Referenciando metodo estatico");
	}

	/**
	 * Variacion 1 : Tradicional Variacion 2 : Lambda Variacion 3 : Metodo de
	 * referencia
	 * 
	 */
	public void metodoInstanciaObjetoArbitrario() {
		System.out.println("Metodo referido en la Instancia del propio metodo");
		String[] nombres = { "Julio", "Alfredo", "Luque", "Ticona" };

		Arrays.sort(nombres, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		System.out.println(Arrays.toString(nombres));

		Arrays.sort(nombres, (n, m) -> -(n.compareToIgnoreCase(m)));
		System.out.println(Arrays.toString(nombres));

		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));
	}

	/**
	 * Accedido e instanciado desde el main
	 */
	public void metodoInstanciaObjetoParticular() {
		System.out.println("Metodo referido de un objeto en particular");
	}

	/**
	 * Referencia apoyada en la clase Persona; Variacion 1 : Tradicional Variacion 2
	 * : Lambda Variacion 3 : Metodo de referencia
	 */
	public void referenciarConstructor() {
		IPersona per = new IPersona() {
			@Override
			public Persona crear(int id, String nombre) {
				return new Persona(id, nombre);
			}
		};
		System.out.println(per.crear(1, "Julio Alfredo"));

		IPersona per2 = (id, nombre) -> new Persona(id, nombre);
		System.out.println(per2.crear(2, "Delfina Sofia"));

		IPersona per3 = Persona::new;
		System.out.println(per3.crear(3, "Griselda Cecilia"));

	}

	public void operar() {
		IOperacion op = () -> AppReferenciarMetodos.metodoEstatico();
		op.ejecutar();
		System.out.println(op.hashCode());

		IOperacion opRef = AppReferenciarMetodos::metodoEstatico;
		opRef.ejecutar();
		System.out.println(opRef.hashCode());
	}

	/**
	 * Las referencias a metodos, se apoyan en las interfaces funcionales. Los
	 * metodos a referencias no aceptan el pase de parametros
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AppReferenciarMetodos app = new AppReferenciarMetodos();

		// LLAMA AL PRIMER METODO DE REFERENCIA POR MEDIO DE OPERAR
		app.operar();

		// LLAMA AL SEGUNDO METODO DE REFERENCIA.
		app.metodoInstanciaObjetoArbitrario();

		// IMPLEMENTAMOS EL METODO SOBRE UN OBJETO PARTICULAR -> 3ER METODO
		IOperacion op = app::metodoInstanciaObjetoParticular;
		op.ejecutar();

		// LLAMA A LA REFERENCIA POR COSNTRUCTOR, ALTERNANDO SIMPLIFICACION DE CODIGO.
		// TRACICIONAL -> LAMBDA -> REFERENCIA
		app.referenciarConstructor();
	}

}
