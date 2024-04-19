package reto11;


import java.time.LocalDate;
public class Programador extends Empleado {
    private String lenguajePrincipal;

    public Programador(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String lenguajePrincipal) {
        super(nombre, edad, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    // Getter para lenguajePrincipal
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }
}