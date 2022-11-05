//Expresión Lambda que elimine espacios, comas y puntos de una frase y además la devuelva la frase convertida en mayúscula.

package org.luisf.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class JavaLambda {
    public static void main(String[] args) {

        //Expresión Lambda que elimine espacios, comas y puntos de una frase y además la devuelva la frase convertida en mayúscula.
        Function<String, String> cleanLine = line -> line.replaceAll("\\W", "").toUpperCase();
        String result = cleanLine.apply("This is the last time, for real!!.");
        System.out.println("result = " + result);

        //Expresión Lambda que cuenta la cantidad de veces que se repiten las palabras de una frase y devuelva la mas repetida
        Function<String, String > countRepeat = line -> {
            String maxRepeated = "";
            int maxNum = 0;
            String[] words= line.split(" ");
            Map<String,Integer > hash = new HashMap<>();

            for (String word: words) {
                if (hash.containsKey(word)) {
                    //Word exists
                    hash.put(word, hash.get(word)+1);
                }
                else {
                    hash.put(word,1);
                }
            }

            for (Map.Entry<String,Integer> item: hash.entrySet()) {
                System.out.println("key = " + item.getKey() + " Value = " + item.getValue());
                if(item.getValue() > maxNum){
                    maxRepeated = item.getKey();
                    maxNum = item.getValue();
                }
            }
          return maxRepeated;
        };

        System.out.println("The most repeated is = " + countRepeat.apply("El hipopotamo hipo tiene hipo, quien le quita el hipo al hipopotamo hipo"));

    }
}
