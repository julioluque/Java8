package ar.jluque.java8.varios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaAppVarios {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(4, 3, 6, 1, 7, 3, 5, 1, 5, 8, 9, 4, 0, 1, 9, 2, 6);

//		Implmenta comparator de una clase que implmenta la interfaz. se apoya en otra clase
		lista.sort(new MayorAMenor());
		lista.forEach((n) -> System.out.println(n));
		
		System.out.println("------------------------------");
		
//		clase anonima, que implementa la interfaz de la instanciacion de la clase anonima. per aun requiere sobreescribir.
		lista.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		lista.forEach((p)->System.out.println(p));
		
		System.out.println("------------------------------");
//		Simplificacion lambda 1
		lista.sort((o1, o2) -> o1.compareTo(o2));
		lista.forEach((q)->System.out.println(q));
		
		System.out.println("------------------------------");
//		Simplificacion de la calse anonima. simlificacion lambda en su maxima expresion
		lista.sort(Integer::compareTo);
		lista.forEach(System.out::println);
		
	}
}
