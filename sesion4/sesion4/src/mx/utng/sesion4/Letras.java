package mx.utng.sesion4;

public class Letras {

    public static void main(String[] args) {
        
        Lector lector = new Lector ();
        lector.muestraMensaje("Teclea una palabra");
        String palabra = lector.leerEntrada();

        ContadorCaracteres contador = new ContadorCaracteres();

        int numeroVocales = contador.cuentaVocales(palabra);
        System.out.println("Hay "+numeroVocales+" vocales");

        int numeroNumero = contador.cuentaVocales(palabra);
        System.out.println("Hay "+numeroNumero+" vocales");

        int numeroSimbolo = contador.cuentaVocales(palabra);
        System.out.println("Hay "+numeroSimbolo+" vocales");

        int numeroConsonante = contador.cuentaVocales(palabra);
        System.out.println("Hay "+numeroConsonante+" vocales");

        
    }

}
