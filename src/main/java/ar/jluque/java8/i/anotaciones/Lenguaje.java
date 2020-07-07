package ar.jluque.java8.i.anotaciones;

import java.lang.annotation.Repeatable;

@Repeatable(value = Lenguajes.class)
public @interface Lenguaje {
	String value();
}