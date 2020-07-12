package ar.jluque.mito.i.anotaciones;

public class AppAnotaciones {

	public static void main(String[] args) {
		Lenguaje[] lenguajeArrayV7 = ILenguajeVersion7.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("La interfaz de la version 7 de Lenguaje tiene " + lenguajeArrayV7.length + " anotaciones");

		Lenguaje[] lenguajeArrayV8 = ILenguajeVersion8.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("La nueva interfaz de la version 8 tiene " + lenguajeArrayV8.length + " anotaciones");

		Lenguajes len = ILenguajeVersion8.class.getAnnotation(Lenguajes.class);
		for (Lenguaje elemento : len.value()) {
			System.out.println(elemento.value());
		}

	}
}
