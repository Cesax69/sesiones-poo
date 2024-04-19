package reto11;
import java.time.LocalDate;


public class Persona {
    private final String nombre;
    private final byte edad;
    private final LocalDate fechaNacimiento;

    public Persona(String nombre, byte edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters para nombre, edad y fechaNacimiento
    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
