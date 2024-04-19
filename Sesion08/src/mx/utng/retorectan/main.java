package mx.utng.retorectan;

import mx.utng.Rectangulo;

public class main {
    public static void main(String[] args) {
       
        Rectangulo rectangulo1 = new Rectangulo();          
        Rectangulo rectangulo2 = new Rectangulo(2);         
        Rectangulo rectangulo3 = new Rectangulo(3, 2);      

        
        System.out.println("Área del rectángulo1: " + rectangulo1.calcularArea());
        System.out.println("Área del rectángulo2: " + rectangulo2.calcularArea());
        System.out.println("Área del rectángulo3: " + rectangulo3.calcularArea());
    }
}
