//Este programa fue realizado por Cesar Enrique Garay Garcia

package mx.utng.Figuras;
public class Main {
    public static void main(String[] args) {
        Figura figura;

        figura = new Triangulo();
        figura.formulaCalculaArea();

        figura = new Rectangulo();
        figura.formulaCalculaArea();

        figura = new Cuadrado();
        figura.formulaCalculaArea();
    }
}

