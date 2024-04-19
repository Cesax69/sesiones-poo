package mx.utng;

import mx.utng.s11.Triangulo;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo (4.0, 5.0, "Estilo 1");
        System.out.println("Informacion sobre el triangulo");
        triangulo.mostrarEstilo();
        triangulo.mostrarDimension();
        System.out.println("El area del triangulo es: "+ triangulo.area());

        Triangulo triangulo1 = new Triangulo (7.0, 3.0, "Estilo 1");
        System.out.println("Informacion sobre el triangulo");
        triangulo.mostrarEstilo();
        triangulo.mostrarDimension();
        System.out.println("El area del triangulo es: "+ triangulo.area());

        Triangulo triangulo2 = new Triangulo (5.0, 4.0, "Estilo 1");
        System.out.println("Informacion sobre el triangulo");
        triangulo.mostrarEstilo();
        triangulo.mostrarDimension();
        System.out.println("El area del triangulo es: "+ triangulo.area());
    }

    
}
