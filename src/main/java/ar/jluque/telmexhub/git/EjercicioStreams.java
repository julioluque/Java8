package ar.jluque.telmexhub.git;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EjercicioStreams {
    
    private static final String PALABRA = "[- .:;,¡!]";
    
    /**
     * Cuenta las líneas del archivo usando el reader provisto
     */
    private void ejercicio1() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("poema.txt"), StandardCharsets.UTF_8)){
            
            // código aquí
            
        }
    }

    /**
     * Crea una lista de palabras sin duplicados del archivo provisto en reader
     * Tip: Ya se cuenta con la expresión PALABRA
     */
    private void ejercicio2() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("poema.txt"), StandardCharsets.UTF_8)){
            
            // código aquí
            
        }
    }
    
    /**
     * Crea una lista de palabras en minusculas y sin duplicados 
     * del archivo provisto en reader y ordenadas alfabéticamente
     */
    private void ejercicio3() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("poema.txt"), StandardCharsets.UTF_8)){
            
            // código aquí
            
        }
    }
    
    /**
     * Modifica el ejercicio3 para que las palabras esten ordenadas por longitud
     */
    private void ejercicio4() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("poema.txt"), StandardCharsets.UTF_8)){
            
            // código aquí
            
        }
    }
    
    /**
     * Has un histograma de cada palabra que aparece, todas en minúsculas
     */
    private void ejercicio5() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("poema.txt"), StandardCharsets.UTF_8)){
            
            // código aquí
            
        }
    }
    
    /**
     * Complementa el código para la clase RandomWords 
     * con una lista de 1000 palabras agrupalas por longitud
     */
    private void ejercicio6() throws IOException {
        RandomWords rand = new RandomWords();
        List<String> list = rand.createList(1000);
        
        //código aquí
        
    }
    
    
    public static void main(String[] args) throws IOException {
        EjercicioStreams es = new EjercicioStreams();
        System.out.println("Lambdas y Stream API EjercicioStreams");
        System.out.println("Ejercicio 1");
        es.ejercicio1();
        System.out.println("Ejercicio 2");
        es.ejercicio2();
        System.out.println("Ejercicio 3");
        es.ejercicio3();
        System.out.println("Ejercicio 4");
        es.ejercicio4();
        System.out.println("Ejercicio 5");
        es.ejercicio5();
        System.out.println("Ejercicio 6");
        es.ejercicio6();
    }
    
}
