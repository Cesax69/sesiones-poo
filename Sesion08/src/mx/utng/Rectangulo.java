package mx.utng;
public class Rectangulo{

    private double alto;
    private double ancho;

    // Primer constructor sin parámetros
    public Rectangulo() {
        this.alto = 0;
        this.ancho = 0;
    }

    // Segundo constructor con un número como parámetro
    public Rectangulo(double lado) {
        this.alto = lado;
        this.ancho = lado;
    }

    // Tercer constructor con dos números como parámetros
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    // Método para calcular el área
    public double calcularArea() {
        return alto * ancho;
    }
}
