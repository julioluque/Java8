package ar.jluque.telmexhub.lambda;

public class ConmutadorController implements IConmutador {

	public void llamar(Telefono t) {
		System.out.println("... llamando a : " + t.getNombre() + ", Nro : " + t.getTelefono());
	}

}
