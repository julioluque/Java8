package ar.jluque.java8.c.interfacesfuncionales;

@FunctionalInterface
public interface IOperacion {

	public double calcular(double x, double y);

	/**
	 * PARA QUE LA INTERFAZ SEA FUNCIONAL, DEBE TENER UN SOLO METODO. POR ESO SE
	 * COMENTA EL SEGUNDO METODO
	 */
//	public String mensajeError(); 

	
	/**
	 * Una interfaz funcional, adminte metodos por defecto. pero solo un metodo abstracto
	 */
	default public void ejecutar() {
		System.out.println("Se esta ejecutando una interfaz funcional");
	}
	
	default public void iniciado() {
		System.out.println("El metodo fue iniciado");
	}
	
}
