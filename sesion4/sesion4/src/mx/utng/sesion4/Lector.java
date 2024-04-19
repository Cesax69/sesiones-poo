package mx.utng.sesion4;

import java.util.Scanner;

public class Lector {

    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //crear lector  de valores desde la terminal
        Scanner lector = new Scanner(System.in);

        System.out.println("Teclea tu nombre:");
        //leer lo que usuario mande como entrada
        String nombre = lector.nextLine();
        //concatenacion
        System.out.println("Hola "+ nombre);
        //interpolacion
        int edad = 18;
        boolean casado = true;
        System.out.printf("Hola me llamo %s, y tengo %d años y %s casado", nombre, edad, casado==true?"soy":"no soy");
    }
 
    //Metodo muestra una cadena dada como parametro 
    public void muestraMensaje(String mensaje){
        System.out.println(mensaje);

    }

    //leer a partir del scanner 
    public String leerEntrada(){
        return scanner.nextLine();
    } 
}

