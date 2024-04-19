package mx.utng.ej1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    
    public static void main (String[] args){

        Profesor profa = new Profesor("Paty", "Hernandez Lopez", "UTNG00541");
        profa.vivir();
        profa.mostrarDatos();

        Profesor profe = new ProfesorInterino("Jose", "Gutierrez Sanchez", "UTNG00551", LocalDate.of(2024, Month.DECEMBER, 21));
        profe.mostrarDatos();
        profe.vivir();
    }
}
