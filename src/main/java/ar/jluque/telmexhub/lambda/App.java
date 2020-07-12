package ar.jluque.telmexhub.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();
		Mock agenda = new Mock();
		personas = agenda.CargarDatos();

		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNombre().compareTo(o2.getNombre()); 
			}
		});

		Collections.sort(personas, (o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
		

		PersonaController metodos = new PersonaController();
//		metodos.imprimirTodos(personas);
//		metodos.llamarChoferes(personas);
//		metodos.llamarMayores(personas);
//		metodos.llamarVotantes(personas);
//		metodos.nollamar(personas);

		PersonaParametrizadoController param = new PersonaParametrizadoController();
//		param.llamarSi(personas);

	}

}
