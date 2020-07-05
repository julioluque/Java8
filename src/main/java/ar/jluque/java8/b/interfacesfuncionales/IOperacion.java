package ar.jluque.java8.b.interfacesfuncionales;

@FunctionalInterface
public interface IOperacion {

	public double calcular(double x, double y);

	/**
	 * PARA QUE LA INTERFAZ SEA FUNCIONAL, DEBE TENER UN SOLO METODO. POR ESO SE
	 * COMENTA EL SEGUNDO METODO
	 */
//	public String mensajeError(); 
}
