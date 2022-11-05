//Expresión Lambda que elimine espacios, comas y puntos de una frase y además la devuelva la frase convertida en mayúscula.

package org.luisf.model;

import java.util.function.Function;

public class JavaLambda {
    public static void main(String[] args) {
        Function<String, String> cleanLine = line -> line.replaceAll("\\W", "").toUpperCase();
        String result = cleanLine.apply("This is the last time, for real!!.");
        System.out.println("result = " + result);

    }
}
