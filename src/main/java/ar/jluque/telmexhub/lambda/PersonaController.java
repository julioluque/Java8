package ar.jluque.telmexhub.lambda;

import java.util.List;

public class PersonaController {

	ConmutadorController conmutador = new ConmutadorController();

	public void imprimirTodos(List<Persona> personas) {
		System.out.println("imprimirTodos---------------");
		personas.stream().forEach(p -> System.out.println(p));
	}

	public void llamarChoferes(List<Persona> personas) {
		System.out.println("llamarChoferes -------------");
		for (Persona p : personas) {
			if (p.getEdad() >= 18) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.llamar(tel);
			}
		}
	}

	public void llamarVotantes(List<Persona> personas) {
		System.out.println("llamarVotantes-------------");
		for (Persona p : personas) {
			if (p.getEdad() >= 16) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.llamar(tel);
			}
		}
	}

	public void llamarMayores(List<Persona> personas) {
		System.out.println("llamarMayores-------------");
		for (Persona p : personas) {
			if (p.getEdad() >= 60) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.llamar(tel);
			}
		}
	}

	public void nollamar(List<Persona> personas) {
		System.out.println("No llamar-------------");
		for (Persona p : personas) {
			if (p.getEdad() < 16) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.filtroLLamadas(tel);
			}
		}
	}

}
