package ar.jluque.mito.i.anotaciones;

import java.lang.annotation.Repeatable;

@Repeatable(value = Lenguajes.class)
public @interface Lenguaje {
	String value();
}