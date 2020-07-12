package ar.jluque.decharlas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MetodosImpl implements IMetodos {

	@Override
	public void setStream(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getStream() {

		//Usando colecciones
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 10_000_000; i++) {
			numeros.add((int) Math.round(Math.random() * 100));
		}
//		for (Integer integer : numeros) {
//			System.out.println(integer);
//		}

		Stream<Integer> n1 = numeros.stream();
		Stream<Integer> n2 = numeros.parallelStream();

		//Directamente con valores y rangos.
		Stream.of("usando", "streans", "En", "las", "clases", "con", "java", "8");
		Stream.of("usando", "streans", "paralelos", "con", "java", "8").parallel();

		
		
		return numeros;
	}

}
