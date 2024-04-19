import java.time.LocalDate;

import reto11.DBA;
import reto11.Programador;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Programador
        Programador programador = new Programador("Juan", (byte) 30, LocalDate.of(1994, 5, 15), 60000.0f, "Java");
        System.out.println("Nombre del programador: " + programador.getNombre());
        System.out.println("Edad del programador: " + programador.getEdad());
        System.out.println("Fecha de nacimiento del programador: " + programador.getFechaNacimiento());
        System.out.println("Salario del programador: $" + programador.getSalario());
        System.out.println("Lenguaje principal del programador: " + programador.getLenguajePrincipal());

        // Crear una instancia de DBA
        DBA dba = new DBA("María", (byte) 28, LocalDate.of(1996, 8, 20), 55000.0f, "SQL");
        System.out.println("\nNombre del DBA: " + dba.getNombre());
        System.out.println("Edad del DBA: " + dba.getEdad());
        System.out.println("Fecha de nacimiento del DBA: " + dba.getFechaNacimiento());
        System.out.println("Salario del DBA: $" + dba.getSalario());
        System.out.println("Herramienta de consultas del DBA: " + dba.getHerramientaConsultas());
    }
}