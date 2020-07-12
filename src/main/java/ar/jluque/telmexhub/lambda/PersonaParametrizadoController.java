package ar.jluque.telmexhub.lambda;

import java.util.List;

public class PersonaParametrizadoController {

	ConmutadorController conmutador = new ConmutadorController();

	public void llamarChoferes(List<Persona> personas, int edad) {
		System.out.println("llamarChoferes-------------");
		for (Persona p : personas) {
			if (p.getEdad() >= edad) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.llamar(tel);
			}
		}
	}

	public void llamarVotantes(List<Persona> personas, int edad) {
		System.out.println("llamarVotantes-------------");
		for (Persona p : personas) {
			if (p.getEdad() >= edad) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.llamar(tel);
			}
		}
	}

	public void llamarMayores(List<Persona> personas, int edad) {
		System.out.println("llamarMayores-------------");
		for (Persona p : personas) {
			if (p.getEdad() >= edad) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.llamar(tel);
			}
		}
	}

	public void nollamar(List<Persona> personas, int edad) {
		System.out.println("No llamar-------------");
		for (Persona p : personas) {
			if (p.getEdad() < edad) {
				Telefono tel = new Telefono();
				tel.setTelefono(p.getTelefono());
				tel.setNombre(p.getNombre());
				conmutador.filtroLLamadas(tel);
			}
		}
	}

	public void llamarSi(List<Persona> personas) {
		llamarVotantes(personas, 16);
		llamarChoferes(personas, 18);
		llamarMayores(personas, 60);
		nollamar(personas, 13);
	}
}
