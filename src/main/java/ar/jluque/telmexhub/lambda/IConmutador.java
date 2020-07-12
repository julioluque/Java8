package ar.jluque.telmexhub.lambda;

public interface IConmutador {

	public void llamar(Telefono t);

	default void filtroLLamadas(Telefono t) {
		System.out.println("El conmutador filtro un llamado : " + t.getNombre() + ", Nro : " + t.getTelefono());
	}
}
