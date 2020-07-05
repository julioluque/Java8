package ar.jluque.java8.b.defaultmethods;

public interface IVendedor {

	public void caminar();
	
	default public void respirar() {
		System.out.println("Esta persona respira inconcientemente o por defecto");
	}
	
	default public void hablar() {
		System.out.println("Al vendedor, por defecto, le gusta hablar");
	}
}
