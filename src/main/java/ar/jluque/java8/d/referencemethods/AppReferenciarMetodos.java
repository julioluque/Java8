package ar.jluque.java8.d.referencemethods;

import java.util.Arrays;
import java.util.Comparator;

public class AppReferenciarMetodos {

	public static void metodoEstatico() {
		System.out.println("Referenciando metodo estatico");
	}

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

	public void metodoInstanciaObjetoParticular() {
		System.out.println("Metodo referido de un objeto en particular");
	}

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

	public static void main(String[] args) {
		AppReferenciarMetodos app = new AppReferenciarMetodos();
		
		app.operar();
		
		app.metodoInstanciaObjetoArbitrario();

		IOperacion op = app::metodoInstanciaObjetoParticular;
		op.ejecutar();

		app.referenciarConstructor();
	}

}
