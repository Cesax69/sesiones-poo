package reto11;
import java.time.LocalDate;

public class Empleado extends Persona {
    private float salario;

    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }

    // Getter para salario
    public float getSalario() {
        return salario;
    }
}
