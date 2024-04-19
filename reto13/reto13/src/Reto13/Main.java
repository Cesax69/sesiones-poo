package Reto13;
import java.util.ArrayList;
import java.util.Collections;
// Cesar Enrique Garay Garcia-GDS0622
public class Main {
    public static void main(String[] args) {
        // Crear una lista de frutas
        ArrayList<String> listaFrutas = new ArrayList<>();
        Collections.addAll(listaFrutas, "Plátanos", "Sandía", "Pera", "Manzana", "Naranja", "Kiwi");

        // Invertir el orden de los elementos en la lista
        Collections.reverse(listaFrutas);

        // Imprimir la lista de frutas invertida
        System.out.println("Lista de frutas invertida: " + listaFrutas);

        // Encontrar el elemento más pequeño (alfabéticamente)
        String minElemento = Collections.min(listaFrutas);

        // Encontrar el elemento más grande (alfabéticamente)
        String maxElemento = Collections.max(listaFrutas);

        // Imprimir los resultados
        System.out.println("El elemento más pequeño (alfabéticamente): " + minElemento);
        System.out.println("El elemento más grande (alfabéticamente): " + maxElemento);
    }
}
