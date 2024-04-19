package mx.utng.ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Colecciones {
    public static void main(String[] args) {
        List <String> listaCadenas = new ArrayList<>();
        System.out.println(listaCadenas.isEmpty());
        System.out.println(listaCadenas);
        //uso de listas
        listaCadenas.add("Venado");
        listaCadenas.add("Ornitorrinco");
        listaCadenas.add("Gato");
        listaCadenas.add("Gato");
        listaCadenas.add("Pejelagarto");
        listaCadenas.add("Aguila");
        //imprimir la lista con todos los elementos 
        System.out.println(listaCadenas);
        //imprimir cada elemento con salto de linea

        System.out.println("Fori");
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println(listaCadenas.get(i));
            
        }

        System.out.println("Foreach");

        //imprimir con foreach
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
            
        }

        //Uso de un conjunto 
        Set <String> conjuntoCadenas = new HashSet<>();
        listaCadenas.add("Venado");
        listaCadenas.add("Ornitorrinco");
        listaCadenas.add("Gato");
        listaCadenas.add("Gato");
        listaCadenas.add("Pejelagarto");
        listaCadenas.add("Aguila");
        System.out.println("Mostrando un set");
        for (String cadena : conjuntoCadenas){
            System.out.println(cadena);
        }
        
        Set<Numero> setNumeros = new HashSet<>();
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("uno"));
        System.out.println("swsde");
        for (Numero numero : setNumeros){
            System.out.println(numero.getNombre());
        }


    }
}
