package ar.jluque.mito.i.anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * por defecto el scope de esta anotacion es el .class, pero para que se
 * extienda debemos colocar una anotacion runntime sobre @Retention
 * 
 * @author Alfredo
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Lenguajes {
	Lenguaje[] value() default {};
}
