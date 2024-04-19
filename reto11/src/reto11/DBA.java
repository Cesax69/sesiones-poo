package reto11;
import java.time.LocalDate;

public class DBA extends Empleado {
    private String herramientaConsultas;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientaConsultas) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientaConsultas = herramientaConsultas;
    }

    // Getter para herramientaConsultas
    public String getHerramientaConsultas() {
        return herramientaConsultas;
    }
}
