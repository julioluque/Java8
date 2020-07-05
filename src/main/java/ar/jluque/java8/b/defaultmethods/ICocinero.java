package ar.jluque.java8.b.defaultmethods;

public interface ICocinero {

	
	default public void hablar() {
		System.out.println("Al cocinero no le gusta hablar demasiado");
	}
}
