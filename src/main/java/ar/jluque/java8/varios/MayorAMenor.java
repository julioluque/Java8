package ar.jluque.java8.varios;

import java.util.Comparator;

public class MayorAMenor implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -(o1.compareTo(o2));
	}

}
