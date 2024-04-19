package mx.utng.sesion29;

import java.util.function.Function;

public class Ejercicio1 {

//private final StringToInteger parser = s -> Integer.parseInt(s);

    private final Function < String, Integer> parser = Integer::parseInt;

    Integer sumar(String a, String b){
        return parser.apply(a)+ parser.apply(b);

    }


    
}